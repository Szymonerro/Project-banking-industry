package org.example.people;

import org.example.enums.Position;
import org.example.interfaces.BankManagerDuties;

public class BankManager extends Human implements BankManagerDuties {

    private int employeeId;
    private Position position;

    public BankManager(String firstName, String lastName, int age, String address, int employeeId, Position position) {
        super(firstName, lastName, age, address);
        this.employeeId = employeeId;
        this.position = position;
    }

    public BankManager() {

    }

    @Override
    public void hireNewEmployee(Human human) {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String toString() {
        return "Employee name: " + getFirstName() + " " + getLastName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress() +
                "\nEmployee ID: " + getEmployeeId() +
                "\nPosition: " + getPosition();
    }
}