package org.example.collectionStream;

import org.example.people.Customer;

import java.util.List;

public class CustomerNameCollectionStream {
    public static void printCustomerNames(List<Customer> customer) {
        List<String> customerNames = customer.stream()
                .map(Customer::getFirstName)
                .map(String::toUpperCase)
                .sorted() // non-terminal operation
                .toList();

        System.out.println("Customer names (capital letters, sorted alphabetically): ");
        customerNames.forEach(System.out::println); // terminal operation
    }
}
