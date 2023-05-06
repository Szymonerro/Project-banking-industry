package org.example.utils;

public class LoanCalculator implements org.example.interfaces.LoanCalculator {
    public void loanCalculator(double loanAmount, int numberOfInstallments, double interestRate) {
        try {
            if (loanAmount < 100) {
                throw new IllegalArgumentException("The loan amount cannot be lower than PLN 100");
            }
            if (numberOfInstallments > 50) {
                throw new IllegalArgumentException("Maximum number of installments is 50");
            }
            double refundAmount = loanAmount + (loanAmount * interestRate * 0.01);
            double installment = (loanAmount + (loanAmount * interestRate * 0.01)) / numberOfInstallments;
            System.out.println("Loan amount: " + loanAmount + " PLN" +
                    "\nNumber of installments: " + numberOfInstallments +
                    "\nInterest rate: " + interestRate + "%" +
                    "\nInstallment amount: " + installment + " PLN / month" +
                    "\nOverall refund amount: " + refundAmount + " PLN\n");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}