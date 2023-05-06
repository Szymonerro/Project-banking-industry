package org.example.account;

import org.example.enums.AccountType;
import org.example.interfaces.AccountLimits;
import org.example.people.Customer;

public class SavingsAccount extends Account implements AccountLimits {

    private final AccountType accountType;
    private final int interestRate;
    private static final int WITHDRAWAL_LIMIT = 10;
    private static final int MAX_DAILY_TRANSFERS = 5;
    private static final double MAX_DAILY_TRANSFER_AMOUNT = 15000;

    public SavingsAccount(Customer customer, AccountType accountType, long accountNumber, int interestRate, double balance) {
        super(customer, accountNumber, balance);
        this.accountType = accountType;
        this.interestRate = interestRate;
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
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "Account owner: " + customer.getFirstName() + " " + customer.getLastName() +
                "\nAccount type: " + accountType +
                "\nAccount number: " + getAccountNumber() +
                "\nInterest rate: " + getInterestRate() + "%" +
                "\nBalance: " + getBalance() + " PLN";
    }
}
