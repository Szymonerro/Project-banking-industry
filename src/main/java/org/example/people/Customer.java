package org.example.people;

public class Customer extends Human {
    String companyName;
    int taxNum;

    public Customer(String firstName, String lastName, int age, String address) {
        super(firstName, lastName, age, address);
    }

    public Customer(String companyName, int taxNum, String address) {
        this.address = address;
        this.companyName = companyName;
        this.taxNum = taxNum;
    }

    public Customer() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTaxNum() {
        return taxNum;
    }

    public void setTaxNum(int taxNum) {
        this.taxNum = taxNum;
    }

    public String toString() {


        if (companyName != null) {
                return "Company name: " + companyName +
                        "\nTAX Number: " + taxNum +
                        "\nAddress: " + address;
            } else
                return "Customer: " + getFirstName() + " " + getLastName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress();
        }
    }