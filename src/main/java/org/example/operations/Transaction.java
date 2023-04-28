package org.example.operations;                                                  // add transaction ID

public abstract class Transaction {
    protected double balanceBefore;
    protected double newBalance;


    public double getBalanceBefore() {
        return balanceBefore;
    }

    public void setBalanceBefore(double balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }
}
