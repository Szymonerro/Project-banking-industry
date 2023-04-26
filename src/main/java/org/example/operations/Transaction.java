package org.example.operations;

public class Transaction {
    private String transactionType;

    public Transaction(String transactionType) {
        this.transactionType = transactionType;
    }

    public Transaction() {

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