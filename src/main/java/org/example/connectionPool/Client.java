package org.example.connectionPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
            Connection connection = ConnectionPool.getInstance().getConnection();
            connection.connect();
            TimeUnit.SECONDS.sleep(3);
            connection.release();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
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
