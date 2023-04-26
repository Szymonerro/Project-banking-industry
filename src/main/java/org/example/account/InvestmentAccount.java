package org.example.account;

import org.example.people.Customer;

public class InvestmentAccount extends Account {
    private int interestRate;

    public InvestmentAccount(Customer owner, long accountNumber, String accountType, double balance, int interestRate) {
        super(owner, accountNumber, accountType, balance);
        this.interestRate = interestRate;
    }

    public InvestmentAccount () {

    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public String toString() {
        return "Account owner is " + owner +
                "\nAccount number is " + getAccountNumber() +
                "\nAccount type is " + getAccountType() +
                "\nBalance is " + getBalance() +
                "\nInterest Rate is: " + getInterestRate() + "%";
    }
}