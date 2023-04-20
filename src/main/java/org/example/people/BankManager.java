package org.example.people;

public class BankManager extends Human {

    public BankManager(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
    }

    public String toString() {
        return "Customer name: " + getFirstName() + " " + getLastName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress();
    }
}