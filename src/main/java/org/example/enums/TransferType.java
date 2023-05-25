package org.example.enums;

public enum TransferType {
    DOMESTIC ("Domestic transfer"),
    INTERNATIONAL ("International transfer"),
    BLIK ("BLIK transfer");

    private final String description;

    TransferType (String description) {this.description = description;}
    public String getDescription() {
        return description;
    }


}
