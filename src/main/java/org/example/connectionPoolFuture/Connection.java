package org.example.connectionPoolFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

class Connection {
    private final int connectionId;
    private static final Logger LOGGER = LogManager.getLogger(Connection.class);

    public Connection(int connectionId) {
        this.connectionId = connectionId;
    }

    public CompletableFuture<Void> connectAsync() {
        CompletableFuture<Void> future = new CompletableFuture<>();
        ConnectionPool.getInstance().decrementWaitingClients();
        LOGGER.info("(Client/Thread ID: {}) - Successfully connected to the database. Connection ID: {}. Waiting clients: {}",
                Thread.currentThread().getId(), connectionId, ConnectionPool.getInstance().getWaitingClients());
        future.complete(null);
        return future;
    }

    public CompletableFuture<Void> releaseAsync() {
        CompletableFuture<Void> future = new CompletableFuture<>();
        LOGGER.info("(Client/Thread ID: {}) - Released connection. Connection ID: {}. Waiting clients: {}",
                Thread.currentThread().getId(), connectionId, ConnectionPool.getInstance().getWaitingClients());
        ConnectionPool.getInstance().releaseConnection(this);
        future.complete(null);
        return future;
    }
}
