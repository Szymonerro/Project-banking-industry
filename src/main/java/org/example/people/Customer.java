package org.example.people;

import org.example.enums.EmploymentContractType;
import org.example.enums.Title;
import org.example.interfaces.ICreditScoring;

public class Customer extends Person implements ICreditScoring {
    private String companyName;
    private int taxNum;
    private int creditScore;
    private double totalInstallments;

    public Customer(Title title, String firstName, String lastName, int age, String address, EmploymentContractType employmentContractType, double salary) {
        super(title, firstName, lastName, age, address, salary);
        this.employmentContractType = employmentContractType;
    }

    public Customer(String companyName, int taxNum, String address) {
        this.companyName = companyName;
        this.taxNum = taxNum;
        this.address = address;
    }

    @Override
    public boolean isAdult() {
        return age >= 18;
    }

    @Override
    public void creditScoring() {
        if (age < 18 || age > 80 || salary < 1000 || totalInstallments > (salary / 2) || employmentContractType == EmploymentContractType.UNEMPLOYED) {
            setCreditScore(0);
            System.out.println("We're sorry, but your credit score is 0 pts. for the moment.\n");
        } else if (salary >= 1000 && salary < 3000) {
            setCreditScore(10);
            System.out.println("Customer " + "(" + getFirstName() + " " + getLastName() + ")" + " credit score is " + getCreditScore() + " pts.\n");
        } else if (salary >= 3000 && salary < 5000) {
            setCreditScore(20);
            System.out.println("Customer " + "(" + getFirstName() + " " + getLastName() + ")" + " credit score is " + getCreditScore() + " pts.\n");
        } else if (salary >= 5000 && salary < 8000) {
            setCreditScore(30);
            System.out.println("Customer " + "(" + getFirstName() + " " + getLastName() + ")" + " credit score is " + getCreditScore() + " pts.\n");
        } else if (salary >= 8000 && salary < 12000) {
            setCreditScore(40);
            System.out.println("Customer " + "(" + getFirstName() + " " + getLastName() + ")" + " credit score is " + getCreditScore() + " pts.\n");
        } else if (salary >= 12000 && salary < 15000) {
            setCreditScore(50);
            System.out.println("Customer " + "(" + getFirstName() + " " + getLastName() + ")" + " credit score is " + getCreditScore() + " pts.\n");
        } else if (salary >= 15000 && salary < 20000) {
            setCreditScore(60);
            System.out.println("Customer " + "(" + getFirstName() + " " + getLastName() + ")" + " credit score is " + getCreditScore() + " pts.\n");
        } else if (salary >= 20000) {
            setCreditScore(70);
            System.out.println("Customer " + "(" + getFirstName() + " " + getLastName() + ")" + " credit score is " + getCreditScore() + " pts.\n");
        }
    }


    public String getCompanyName() {
        return companyName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double getTotalInstallments() {
        return totalInstallments;
    }
    public void setTotalInstallments(double totalInstallments) {
        this.totalInstallments = totalInstallments;
    }

    public String toString() {
        if (companyName != null) {
            return "Company name: " + companyName +
                    "\nTAX Number: " + taxNum +
                    "\nAddress: " + address;
        } else {
            return "Customer: " + "(" + getTitle() + ") " + getFirstName() + " " + getLastName() +
                    "\nAge: " + getAge() +
                    "\nAddress: " + getAddress();
        }
    }
}
