package org.example.enums;


public enum AccountType {
    PRIVATE("Private account"),
    BUSINESS("Business account"),
    INVESTMENT("Investment account"),
    SAVINGS("Savings account");

    private final String description;

    AccountType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}