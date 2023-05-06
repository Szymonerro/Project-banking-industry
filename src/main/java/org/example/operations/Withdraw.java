package org.example.operations;

import org.example.account.Account;
import org.example.exceptions.InsufficientFundsException;

public class Withdraw extends Transaction {
    private double amount;

    public final void withdraw(Account account, double amount) {
        try {
            if (account.getWithdrawalLimitCount() >= account.withdrawalLimit()) {
                System.out.println("Withdrawal limit reached. Change the limits in the bank app.");
                return;
            }
            switch (amount >= 10 ? 1 : 2) {
                case 1 -> {
                    double balanceBefore = account.getBalance();
                    double newBalance = balanceBefore - amount;
                    if (newBalance < 0) {
                        throw new InsufficientFundsException("Insufficient funds");
                    }
                    account.setBalance(newBalance);
                    this.balanceBefore = balanceBefore;
                    this.newBalance = newBalance;
                    this.amount = amount;
                    account.updateWithdrawalLimitCount();
                    System.out.println("Account number: " + account.getAccountNumber() +
                            "\nBalance before operation: " + getBalanceBefore() + " PLN" +
                            "\nWithdrawal: " + getAmount() + " PLN" +
                            "\nNew balance: " + getNewBalance() + " PLN\n");
                }
                case 2 -> System.out.println("Minimum withdrawal amount is 10 PLN\n");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public double getAmount() {
        return amount;
    }
}