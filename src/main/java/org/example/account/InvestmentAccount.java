package org.example.account;

import org.example.enums.AccountType;
import org.example.enums.Title;
import org.example.people.Customer;

public class InvestmentAccount extends Account {

    private Customer customer;
    private AccountType accountType;
    private Title title;
    private int interestRate;

    public InvestmentAccount(Title title, Customer customer, AccountType accountType, long accountNumber, int interestRate, double balance) {
        super(accountNumber, balance);
        this.customer = customer;
        this.accountType = accountType;
        this.interestRate = interestRate;
        this.title = title;
    }

    public InvestmentAccount () {

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

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public String toString() {
        return "Account owner: " + "(" + title + ") " + customer.getFirstName() + " " + customer.getLastName() +
                "\nAccount number: " + getAccountNumber() +
                "\nAccount type: " + accountType +
                "\nBalance: " + getBalance() + " PLN" +
                "\nInterest Rate: " + getInterestRate() + "%";
    }
}