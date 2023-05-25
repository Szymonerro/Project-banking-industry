package org.example.collectionStream;

import org.example.people.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class AdultCustomersStream {
    public static void printAdultCustomers(List<Customer> customers) {
        List<Customer> adultCustomers = customers.stream()
                .filter(c -> c.getAge() >= 18)
                .toList();

        System.out.println("Adult customers only:");
        String customerNames = adultCustomers.stream()
                .map(Customer::getFirstName)
                .collect(Collectors.joining(", "));
        System.out.println(customerNames + "\n");
    }
}
