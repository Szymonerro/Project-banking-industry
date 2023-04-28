package org.example.people;

import org.example.account.Account;
import org.example.enums.Position;
import org.example.interfaces.BankEmployeeDuties;

public class BankEmployee extends Human implements BankEmployeeDuties {
    private int employeeId;
    private Position position;

    public BankEmployee(String firstName, String lastName, int age, String address, int employeeId, Position position) {
        super(firstName, lastName, age, address);
        this.employeeId = employeeId;
        this.position = position;
    }

    public BankEmployee() {

    }

    @Override
    public void openNewAccount(Customer customer, Account account) {

    }

    @Override
    public void closeAccount(Customer customer, Account account) {

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
