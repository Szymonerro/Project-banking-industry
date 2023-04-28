package org.example.operations;

import org.example.account.Account;

public class Transfer extends Transaction {

    private Account from;
    private Account to;
    private double amount;
    private Withdraw withdraw;
    private Deposit deposit;

    public Transfer() {
        this.withdraw = new Withdraw();
        this.deposit = new Deposit();
    }

    public void transfer(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero\n");
            return;
        }
        if (amount > from.getBalance()) {
            System.out.println("Insufficient funds\n");
            return;
        }
        try {
            withdraw.withdraw(from, amount);
            deposit.deposit(to, amount);
            System.out.println("Transfer from account " + from.getAccountNumber() + " to account " + to.getAccountNumber() + " completed successfully\n");
        } catch (Exception e) {
            // balance change cancelled
            deposit.deposit(from, amount);
            withdraw.withdraw(to, amount);
            System.out.println("Transfer failed: " + e.getMessage() + "\n");
        }
    }

    public Account getFrom() {
        return from;
    }

    public void setFrom(Account from) {
        this.from = from;
    }

    public Account getTo() {
        return to;
    }

    public void setTo(Account to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}