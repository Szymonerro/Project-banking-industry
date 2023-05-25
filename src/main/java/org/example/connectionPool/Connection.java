package org.example.connectionPool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Connection {
    private final int connectionId;

    private static final Logger LOGGER = LogManager.getLogger(Connection.class);

    public Connection(int connectionId) {
        this.connectionId = connectionId;
    }

    public void connect() {
        ConnectionPool.getInstance().decrementWaitingClients();
        LOGGER.info("Client/Thread ID: {}) - Successfully connected to the database. Connection ID: {}. Waiting clients: {}",
                Thread.currentThread().getId(), connectionId, ConnectionPool.getInstance().getWaitingClients());
    }

    public void release() {
        LOGGER.info("(Client/Thread ID: {}) - Released connection. Connection ID: {}. Waiting clients: {}",
                Thread.currentThread().getId(), connectionId, ConnectionPool.getInstance().getWaitingClients());
        ConnectionPool.getInstance().releaseConnection(this);
    }
}
