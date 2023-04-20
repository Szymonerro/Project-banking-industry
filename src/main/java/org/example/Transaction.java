package org.example;

public class Transaction {
    private String transactionType;

    public Transaction(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String toString () {
        return "Transaction type: " + getTransactionType();
    }
}