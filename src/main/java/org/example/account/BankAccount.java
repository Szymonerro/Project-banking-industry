package org.example.account;

import org.example.people.Customer;

public class BankAccount extends Account {


    public BankAccount(String firstName, String lastName, long accountNumber, String accountType, double balance, int interestRate) {
        super(firstName, lastName, accountNumber, accountType, balance, interestRate);

    }
    public String toString() {
        return "Account owner is " + getFirstName() + " " + getLastName() +
                "\nAccount number is " + getAccountNumber() +
                "\nAccount type is " + getAccountType() +
                "\nBalance is " + getBalance() +
                "\nInterest Rate is: " + getInterestRate();
    }
}
