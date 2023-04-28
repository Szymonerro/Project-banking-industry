package org.example.operations;
import org.example.account.Account;

public class Withdraw extends Transaction {
    private double amount;

    public void withdraw(Account account, double amount) {
        switch (amount > 0 ? 1 : 2) {
            case 1:
                double balanceBefore = account.getBalance();
                double newBalance = balanceBefore - amount;
                if (newBalance < 0) {
                    System.out.println("Insufficient funds\n");
                    break;
                }
                account.setBalance(newBalance);
                this.balanceBefore = balanceBefore;
                this.newBalance = newBalance;
                this.amount = amount;
                System.out.println("Account number: " + account.getAccountNumber() +
                        "\nBalance before operation: " + getBalanceBefore() + " PLN" +
                        "\nWithdrawal: " + getAmount() + " PLN" +
                        "\nNew balance: " + getNewBalance() + " PLN\n");
                break;
            case 2:
                System.out.println("Amount must be greater than zero\n");
                break;
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
