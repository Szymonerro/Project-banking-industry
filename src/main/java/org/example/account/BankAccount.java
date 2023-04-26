package org.example.account;
import org.example.people.Customer;

public class BankAccount extends Account {


    public BankAccount(Customer owner, long accountNumber, String accountType, double balance) {
        super(owner, accountNumber, accountType, balance);

    }

    public BankAccount () {

    }
    public String toString() {
        return "Account owner is " + owner +
                "\nAccount number is " + getAccountNumber() +
                "\nAccount type is " + getAccountType() +
                "\nBalance is " + getBalance();
    }
}
