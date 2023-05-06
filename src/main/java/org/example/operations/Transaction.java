package org.example.operations;                                                  // add transaction ID

public abstract class Transaction {
    protected double balanceBefore;
    protected double newBalance;


    public double getBalanceBefore() {
        return balanceBefore;
    }
    public double getNewBalance() {
        return newBalance;
    }

}
