package org.example.account;
import org.example.people.Customer;

public class SavingsAccount extends Account{
    private int interestRate;


    public SavingsAccount(Customer owner, long accountNumber, String accountType, double balance, int interestRate) {
        super(owner, accountNumber, accountType, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount () {

    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "Account owner is " + owner +
                "\nAccount number is " + getAccountNumber() +
                "\nAccount type is " + getAccountType() +
                "\nBalance is " + getBalance() +
                "\nInterest rate is: " + getInterestRate() + "%";
    }
}
