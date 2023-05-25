package org.example.operations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.interfaces.ILoanCalculator;
import org.example.people.Customer;

public class CreditRequest implements ILoanCalculator {

    private static final Logger LOGGER = LogManager.getLogger(CreditRequest.class);
    private Customer customer;
    private final double loanAmount;
    private final int numberOfInstallments;
    private final static double INTEREST_RATE = 5;
    private double installment;

    public CreditRequest(Customer customer, double loanAmount, int numberOfInstallments) {
        this.customer = customer;
        this.loanAmount = loanAmount;
        this.numberOfInstallments = numberOfInstallments;
    }

    public void verification() {
        installment = (loanAmount + (loanAmount * CreditRequest.INTEREST_RATE * 0.01)) / numberOfInstallments;
        int creditScore = customer.getCreditScore();
        if (creditScore < 0) {
            LOGGER.warn("We are sorry, but your credit score is too low to be eligible for a loan.");
            return;
        }
        if (loanAmount < 100) {
            LOGGER.warn("The loan amount cannot be lower than PLN 100\n");
            return;
        }
        if (numberOfInstallments > 36) {
            LOGGER.warn("Maximum number of installments is 36\n");
            return;
        }
        if (customer.getSalary() < 1000) {
            LOGGER.warn("""
                    Bank verification negative.
                    Reason: Too low salary
                    """);
            return;
        }
        if (customer.getAge() < 18) {
            LOGGER.warn("""
                    Bank verification negative.
                    Reason: The applicant is not an adult
                    """);
            return;
        }
        if (customer.getAge() > 80) {
            LOGGER.warn("""
                    Bank verification negative.
                    Reason: Applicant is too old
                    """);
            return;
        }
        if (customer.getTotalInstallments() + this.installment > customer.getSalary() / 2) {
            LOGGER.warn("""
                    Bank verification negative.
                    Reason: The requested amount is too high.
                    Try a lower amount.
                    """);
            return;
        }
        loanCalculator(loanAmount, numberOfInstallments, (int) INTEREST_RATE );
    }

    public void loanCalculator(double loanAmount, int numberOfInstallments, double INTEREST_RATE) {
        double refundAmount = loanAmount + (loanAmount * CreditRequest.INTEREST_RATE * 0.01);
        customer.setTotalInstallments(customer.getTotalInstallments() + this.installment);
        LOGGER.info("Positive bank verification. Credit granted. Details:" + "\n" +
                "\nLoan amount: " + loanAmount + " PLN" +
                "\nNumber of installments: " + numberOfInstallments +
                "\nInterest rate: " + CreditRequest.INTEREST_RATE + "%" +
                "\nInstallment amount: " + this.installment + " PLN / month" +
                "\nOverall refund amount: " + refundAmount + " PLN\n");
    }

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}