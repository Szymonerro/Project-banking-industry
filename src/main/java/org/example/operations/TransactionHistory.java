package org.example.operations;

import org.example.account.Account;
import org.example.enums.TransactionType; // CLASS NOT FINISHED

public class TransactionHistory {
    private Account account;
    private TransactionType transactionType;
    private double numberOfTransactions;


    public TransactionHistory(Account account, TransactionType transactionType, double numberOfTransactions) {
        this.account = account;
        this.transactionType = transactionType;
        this.numberOfTransactions = numberOfTransactions;
    }

    public TransactionHistory() {

    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
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
