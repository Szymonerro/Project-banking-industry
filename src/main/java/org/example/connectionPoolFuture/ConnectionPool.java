package org.example.connectionPoolFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

class ConnectionPool {
    private static final int MAX_POOL_SIZE = 5;
    private static final int MAX_WAITING_TIME = 6;
    private static ConnectionPool instance;
    private final BlockingQueue<Connection> connections;
    private final Semaphore semaphore;
    private final AtomicInteger waitingClients;
    private static final Logger LOGGER = LogManager.getLogger(ConnectionPool.class);

    private ConnectionPool() {
        connections = new LinkedBlockingQueue<>();
        semaphore = new Semaphore(MAX_POOL_SIZE);
        waitingClients = new AtomicInteger(0);
        initializeConnections();
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    private void initializeConnections() {
        for (int i = 1; i <= MAX_POOL_SIZE; i++) {
            connections.add(new Connection(i));
        }
    }

    public CompletableFuture<Connection> getConnectionAsync() {
        CompletableFuture<Connection> future = new CompletableFuture<>();
        try {
            semaphore.acquire();
            Connection connection = connections.take();
            future.complete(connection);
        } catch (InterruptedException e) {
            future.completeExceptionally(e);
            Thread.currentThread().interrupt();
        }
        return future;
    }

    public void releaseConnection(Connection connection) {
        try {
            connections.put(connection);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        semaphore.release();
    }

    public int getWaitingClients() {
        return waitingClients.get();
    }

    protected void incrementWaitingClients() {
        waitingClients.incrementAndGet();
    }

    protected void decrementWaitingClients() {
        waitingClients.decrementAndGet();
    }

    public void shutdown() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(MAX_WAITING_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
            boolean shouldShutdown = false;
            if (waitingClients.get() == 0) {
                try {
                    TimeUnit.SECONDS.sleep(MAX_WAITING_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (waitingClients.get() == 0) {
                    shouldShutdown = true;
                }
            }
            if (shouldShutdown) {
                LOGGER.info("\nNo more waiting clients. Shutting down connections.");
                executorService.shutdownNow();
            }
        });
        executorService.shutdown();
    }
}
