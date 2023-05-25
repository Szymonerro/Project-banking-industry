package org.example.collectionStream;

import org.example.people.Customer;

import java.util.List;

public class CustomerSalaryStream {
    public static void filterCustomersAboveSalary(List<Customer> customer, double minimumSalary) {
        List<Customer> aboveSalary = customer.stream()
                .filter(c -> c.getSalary() > minimumSalary)
                .toList();

        System.out.println("Customers with salaries bigger than " + minimumSalary + ": ");
        aboveSalary.forEach(System.out::println);

    }
}
