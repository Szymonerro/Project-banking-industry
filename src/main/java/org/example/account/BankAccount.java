package org.example.account;

import org.example.card.Card;
import org.example.enums.AccountType;
import org.example.interfaces.AccountLimits;
import org.example.people.Customer;

public class BankAccount extends Account implements AccountLimits {

    private final AccountType accountType;
    private static final int WITHDRAWAL_LIMIT = 1;
    private static final int MAX_DAILY_TRANSFERS = 10;
    private static final double MAX_DAILY_TRANSFER_AMOUNT = 10000;

    public BankAccount(Customer customer, AccountType accountType, long accountNumber, double balance) {
        super(customer, accountNumber, balance);
        this.accountType = accountType;
    }
    @Override
    public double withdrawalLimit() {
        return WITHDRAWAL_LIMIT;
    }

    @Override
    public int maxDailyTransfers () {
        return MAX_DAILY_TRANSFERS;
    }

    @Override
    public double maxDailyTransferAmount () {
        return MAX_DAILY_TRANSFER_AMOUNT;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "Account owner: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() +
                "\nAccount type: " + accountType +
                "\nAccount number: " + getAccountNumber() +
                "\nBalance: " + getBalance() + " PLN";
    }
}
