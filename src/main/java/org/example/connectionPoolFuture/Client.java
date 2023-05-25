package org.example.connectionPoolFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Client implements Runnable {

    private static final Logger LOGGER = LogManager.getLogger(Client.class);

    public Client() {
    }

    @Override
    public void run() {
        try {
            LOGGER.info("(Client/Thread ID: {}) - Waiting for a connection. Waiting clients: {}",
                    Thread.currentThread().getId(), ConnectionPool.getInstance().getWaitingClients());
            TimeUnit.SECONDS.sleep(2); // wait 2 seconds

            CompletableFuture<Connection> connectionFuture = ConnectionPool.getInstance().getConnectionAsync();
            Connection connection = connectionFuture.get();

            connection.connectAsync()
                    .thenCompose((Void) -> {
                        try {
                            TimeUnit.SECONDS.sleep(3);
                            connection.releaseAsync().join();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                        return CompletableFuture.completedFuture(null);
                    })
                    .exceptionally((throwable) -> {
                        LOGGER.error("Error occurred: {}", throwable.getMessage());
                        return null;
                    })
                    .join();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            LOGGER.error("Error occurred: {}", e.getMessage());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        for (int i = 1; i <= 7; i++) {
            executorService.submit(() -> {
                connectionPool.incrementWaitingClients();
                new Client().run();
            });
            TimeUnit.MILLISECONDS.sleep(100);
        }
        executorService.shutdown();
        connectionPool.shutdown();
    }
}
