package org.example.people;

import org.example.enums.Title;

import java.util.Objects;

public abstract class Person {
    private Title title;
    private String firstName;
    private String lastName;
    protected int age;
    protected String address;
    protected double salary;

    public Person(Title title, String firstName, String lastName, int age, String address, double salary) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public Person() {

    }

    public abstract boolean isAdult();

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (!Objects.equals(firstName, person.firstName)) return false;
        if (!Objects.equals(lastName, person.lastName)) return false;
        return Objects.equals(address, person.address);
    }

    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    public Title getTitle() {
        return title;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }

}