package org.example.account;
import org.example.people.Customer;

public abstract class Account { //use class owner
    protected Customer owner;
    private long accountNumber;
    private String accountType;
    private double balance;

    public Account(Customer owner, long accountNumber, String accountType, double balance) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;

    }

    public Account() {
    }


    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



    public String toString() {
        return "Account owner is " + owner +
                "\nAccount number is " + getAccountNumber() +
                "\nAccount type is " + getAccountType() +
                "\nBalance is " + getBalance();
    }

}