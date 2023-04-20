package org.example.people;

public class Customer extends Human {

    public Customer(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
    }

    public String toString() {
        return "Customer name: " + getFirstName() + " " + getLastName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress();
    }
}
