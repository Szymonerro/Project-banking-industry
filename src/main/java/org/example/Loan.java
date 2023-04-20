package org.example;

// 15th class - Loan
public class Loan {
    private double loanAmount;
    private int interestRate;

    public Loan(double loanAmount, int interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public String toString () {
        return "Loan amount: " + getLoanAmount() +
                "\nInterest rate: " + getInterestRate();
    }
}
