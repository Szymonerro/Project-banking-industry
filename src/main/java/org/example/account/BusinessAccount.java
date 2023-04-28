package org.example.account;
import org.example.people.Customer;
import org.example.enums.AccountType;
import org.example.enums.Title;

public class BusinessAccount extends Account {
    private Customer company;
    private AccountType accountType;
    private Title title;

    public BusinessAccount(Title title, Customer company, AccountType accountType, long accountNumber, double balance) {
        super(accountNumber, balance);
        this.company = company;
        this.accountType = accountType;
        this.title = title;
    }

    public BusinessAccount () {
    }

    public Customer getCompany() {
        return company;
    }

    public void setCompany(Customer company) {
        this.company = company;
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
        return "Account owner: " + "(" + title + ") " + company.getCompanyName() +
                "\nAccount number: " + getAccountNumber() +
                "\nAccount type: " + getAccountType() +
                "\nBalance: " + getBalance() + " PLN";
    }
}