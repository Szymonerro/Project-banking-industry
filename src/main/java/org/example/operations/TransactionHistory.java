package org.example;

public class TransactionHistory extends Transaction {
    private double numberOfTransactions;

    public TransactionHistory(String transactionType, double numberOfTransactions) {
        super(transactionType);
        this.numberOfTransactions = numberOfTransactions;
    }

    public double getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(double numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public String toString () {
        return "Transaction type: " + getTransactionType() +
                "\nNumberOfTransactions: " + getNumberOfTransactions();
    }
}
