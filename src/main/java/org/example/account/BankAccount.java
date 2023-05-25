package org.example.account;

import org.example.enums.AccountType;
import org.example.interfaces.IAccountLimits;
import org.example.people.Customer;

public class BankAccount extends Account implements IAccountLimits {

    public BankAccount(Customer customer, long accountNumber, double balance) {
        super(customer, AccountType.PRIVATE, accountNumber, balance);
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


    @Override
    public String toString() {
        return "Account owner: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() +
                "\nAccount type: " + accountType.getDescription() +
                "\nAccount number: " + getAccountNumber() +
                "\nBalance: " + getBalance() + " PLN";
    }
}
