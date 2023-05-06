package org.example.people;

import org.example.enums.Position;
import org.example.enums.Title;

public class BankManager extends Person {

    private final int employeeId;
    private final Position position;

    public BankManager(Title title, String firstName, String lastName, int age, String address, int employeeId, Position position, double salary) {
        super(title, firstName, lastName, age, address, salary);
        this.employeeId = employeeId;
        this.position = position;
    }

@Override
    public boolean isAdult() {
    return age >= 18;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public Position getPosition() {
        return position;
    }

    public String toString() {
        return "Employee name: " + getFirstName() + " " + getLastName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress() +
                "\nEmployee ID: " + getEmployeeId() +
                "\nPosition: " + getPosition();
    }
}