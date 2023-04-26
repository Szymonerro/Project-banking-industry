package org.example.people;

public class BankEmployee extends Human {
    private int employeeId;

    public BankEmployee(String firstName, String lastName, int age, String address, int employeeId) {
        super(firstName, lastName, age, address);
    }

    public BankEmployee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String toString() {
        return "Customer name: " + getFirstName() + " " + getLastName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress() +
                "\nEmployee ID: " + getEmployeeId();
    }
}
