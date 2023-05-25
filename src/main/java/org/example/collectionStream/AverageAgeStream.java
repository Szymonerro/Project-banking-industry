package org.example.collectionStream;

import org.example.people.Customer;

import java.util.List;
import java.util.OptionalDouble;

public class AverageAgeStream {
    public static void printAverageAge(List<Customer> customers) {
        OptionalDouble averageAge = customers.stream()
                .mapToInt(Customer::getAge)
                .average();

        System.out.println("Average age of customers: " + averageAge.orElse(0.0));
    }
}
