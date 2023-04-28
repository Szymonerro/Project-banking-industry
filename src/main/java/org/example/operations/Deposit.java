package org.example.operations;

import org.example.account.Account;

public class Deposit extends Transaction {
    private String opis;
    private double amount;

    public void deposit(Account account, double amount) {
        switch (amount > 0 ? 1 : 2) {
            case 1:
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
                break;
            case 2:
                System.out.println("Amount must be greater than zero\n");
                break;
        }
    }

    // Overloaded method with additional parameter - transaction description
    public void deposit(Account account, double amount, String opis) {
        switch (amount > 0 ? 1 : 2) {
            case 1:
                double balanceBefore = account.getBalance();
                double newBalance = balanceBefore + amount;
                account.setBalance(newBalance);
                this.balanceBefore = balanceBefore;
                this.newBalance = newBalance;
                this.amount = amount;
                this.opis = opis;
                System.out.println("Account number: " + account.getAccountNumber() +
                        "\nBalance before operation: " + getBalanceBefore() + " PLN" +
                        "\nDeposit: " + getAmount() + " PLN" +
                        "\nTitle: " + getOpis() +
                        "\nNew balance: " + getNewBalance() + " PLN\n");
                break;
            case 2:
                System.out.println("Amount must be greater than zero\n");
                break;
        }
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
