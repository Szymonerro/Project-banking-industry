package org.example.account;

import org.example.enums.AccountType;
import org.example.interfaces.IAccountLimits;
import org.example.people.Customer;

public class SavingsAccount extends Account implements IAccountLimits {

    private final int interestRate;

    public SavingsAccount(Customer customer, long accountNumber, int interestRate, double balance) {
        super(customer, AccountType.SAVINGS, accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void changeWithdrawalLimit(int newLimit) {
        this.withdrawalLimit = newLimit;
    }

    @Override
    public void changeMaxDailyTransfers(int newLimit) {
        this.maxDailyTransfers = newLimit;
    }

    @Override
    public void changeMaxDailyTransferAmount(double newLimit) {
        this.maxDailyTransferAmount = newLimit;
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
