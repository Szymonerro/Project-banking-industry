package org.example.account;

import org.example.people.Customer;

public class BusinessAccount extends Account {

    public BusinessAccount(Customer owner, long accountNumber, String accountType, double balance) {
        super(owner, accountNumber, accountType, balance);
    }

    public BusinessAccount () {

    }
    public String toString() {
        return "Account owner is " + owner +
                "\nAccount number is " + getAccountNumber() +
                "\nAccount type is " + getAccountType() +
                "\nBalance is " + getBalance();
    }
}