package org.example.collectionStream;

import org.example.people.Customer;

import java.util.List;

public class CustomerCreditScoreStream {
    public static void filterCustomersCreditScore(List<Customer> customer, double minimumCreditScore) {
        List<Customer> aboveCreditScore = customer.stream()
                .filter(c -> c.getCreditScore() > minimumCreditScore)
                .toList();

        System.out.println("Customers with credit scores bigger than " + minimumCreditScore + ": ");
        aboveCreditScore.forEach(System.out::println);

    }
}
