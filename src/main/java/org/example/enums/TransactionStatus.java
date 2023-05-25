package org.example.enums;

public enum TransactionStatus {
    PENDING("Pending", "Transaction is awaiting processing"),
    COMPLETED("Completed", "Transaction has been successfully processed"),
    FAILED("Failed", "Transaction failed to process"),
    CANCELED("Canceled", "Transaction was canceled by the user");

    private String status;
    private String description;

    TransactionStatus(String status, String description) {
        this.status = status;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
