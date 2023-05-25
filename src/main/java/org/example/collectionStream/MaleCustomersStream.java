package org.example.collectionStream;

import org.example.enums.Title;
import org.example.people.Customer;

import java.util.List;

public class MaleCustomersStream {
    public static void filterMaleCustomers(List<Customer> customer) {
        List<Customer> maleCustomers = customer.stream()
                .filter(c -> c.getTitle().equals(Title.MR))
                .toList();

        System.out.println("Male customers: ");
        maleCustomers.forEach(System.out::println);
    }
}
