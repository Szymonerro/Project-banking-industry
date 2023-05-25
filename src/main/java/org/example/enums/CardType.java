package org.example.enums;

public enum CardType {
    DEBIT ("Debit card"),
    CREDIT ("Credit card");

    private final String description;
    CardType (String description) {this.description = description;}
    public String getDescription() {
        return description;
    }
}
