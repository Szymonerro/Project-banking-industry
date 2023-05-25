package org.example.collectionStream;

import org.example.enums.Title;
import org.example.people.Customer;

import java.util.List;

public class FemaleCustomersStream {

    public static void filterFemaleCustomers(List<Customer> customer) {
        List<Customer> femaleCustomers = customer.stream()
                .filter(c -> c.getTitle().equals(Title.MRS))
                .toList();

        System.out.println("Female customers: ");
        femaleCustomers.forEach(System.out::println);

    }
}