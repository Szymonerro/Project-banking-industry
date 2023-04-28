package org.example.account;

import org.example.enums.AccountType;
import org.example.enums.Title;
import org.example.people.Customer;

public class BankAccount extends Account {

    private Customer customer;
    private AccountType accountType;
    private Title title;

    public BankAccount(Title title, Customer customer, AccountType accountType, long accountNumber, double balance) {
        super(accountNumber, balance);
        this.customer = customer;
        this.accountType = accountType;
        this.title = title;
    }

    public BankAccount () {
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String toString() {
        return "Account owner: " + "(" + title + ") " + customer.getFirstName() + " " + customer.getLastName() +
                "\nAccount type: " + accountType +
                "\nAccount number: " + getAccountNumber() +
                "\nBalance: " + getBalance() + " PLN";
    }
}
