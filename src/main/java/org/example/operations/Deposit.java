package org.example.operations;

import org.example.account.Account;

public class Deposit extends Transaction {
    private double amount;


    public void deposit(Account account, double amount) {
        switch (amount > 0 ? 1 : 2) {
            case 1 -> {
                double balanceBefore = account.getBalance();
                double newBalance = balanceBefore + amount;
                account.setBalance(newBalance);
                this.balanceBefore = balanceBefore;
                this.newBalance = newBalance;
                this.amount = amount;
                System.out.println("Account number: " + account.getAccountNumber() +
                        "\nBalance before operation: " + getBalanceBefore() + " PLN" +
                        "\nDeposit: " + getAmount() + " PLN" +
                        "\nNew balance: " + getNewBalance() + " PLN\n");
            }
            case 2 -> System.out.println("Amount must be greater than zero\n");
        }
    }

    public double getAmount() {
        return amount;
    }
}