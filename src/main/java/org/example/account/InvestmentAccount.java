package org.example.account;

import org.example.enums.AccountType;
import org.example.people.Customer;

public class InvestmentAccount extends Account {

    public InvestmentAccount(Customer customer, long accountNumber, double balance) {
        super(customer, AccountType.INVESTMENT, accountNumber, balance);
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