package org.example.collectionStream;

import org.example.people.Customer;

import java.util.List;

public class CustomerCountStream {
    public static void printCustomerCount(List<Customer> customer) {
        long count = customer.size();
        System.out.println("Total number of customers: " + count);
    }
}
