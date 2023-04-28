package org.example.operations;

public class Loan {   // CLASS NOT FINISHED
    private double loanAmount;
    private int interestRate;

    public Loan(double loanAmount, int interestRate) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
    }

    public Loan () {

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
