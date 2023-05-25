package org.example.operations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.account.Account;

public class Deposit extends Transaction {

    private static final Logger LOGGER = LogManager.getLogger(Deposit.class);
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
                LOGGER.info("Account number: " + account.getAccountNumber() +
                        "\nBalance before operation: " + getBalanceBefore() + " PLN" +
                        "\nDeposit: " + getAmount() + " PLN" +
                        "\nNew balance: " + getNewBalance() + " PLN\n");
            }
            case 2 -> LOGGER.warn("Amount must be greater than zero\n");
        }
    }

    public double getAmount() {
        return amount;
    }
}