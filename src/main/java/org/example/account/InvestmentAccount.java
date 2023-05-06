package org.example.account;

import org.example.enums.AccountType;
import org.example.people.Customer;

public class InvestmentAccount extends Account {

    private final AccountType accountType;

    public InvestmentAccount(Customer customer, AccountType accountType, long accountNumber, double balance) {
        super(customer, accountNumber, balance);
        this.accountType = accountType;
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account owner: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() +
                "\nAccount number: " + getAccountNumber() +
                "\nAccount type: " + accountType +
                "\nBalance: " + getBalance() + " PLN";
    }
}