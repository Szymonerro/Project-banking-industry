package org.example.utils;

import org.example.interfaces.ICreditScoring;

public class CreditScoreCalculator implements ICreditScoring {
    private final int age;
    private final double salary;
    private final double totalInstallments;

    public CreditScoreCalculator(int age, double salary, double totalInstallments) {
        this.age = age;
        this.salary = salary;
        this.totalInstallments = totalInstallments;
    }

    @Override
    public void creditScoring() {
        if (age < 18 || age > 80 || salary < 1000 || totalInstallments > (salary / 2)) {
            System.out.println("We're sorry, but your credit score is 0 pts. for the moment.\n");
        } else if (salary >= 1000 && salary < 3000) {
            System.out.println("Your credit score is 10 pts.\n");
        } else if (salary >= 3000 && salary < 5000) {
            System.out.println("Your credit score is 20 pts.\n");
        } else if (salary >= 5000 && salary < 8000) {
            System.out.println("Your credit score is 30 pts.\n");
        } else if (salary >= 8000 && salary < 12000) {
            System.out.println("Your credit score is 40 pts.\n");
        } else if (salary >= 12000 && salary < 15000) {
            System.out.println("Your credit score is 50 pts.\n");
        } else if (salary >= 15000 && salary < 20000) {
            System.out.println("Your credit score is 60 pts.\n");
        } else if (salary >= 20000) {
            System.out.println("Your credit score is 70 pts.\n");
        }
    }
}
