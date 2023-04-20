package org.example.card;

public class CreditCard extends Card {

    public CreditCard(String cardType, String owner) {
        super(cardType, owner);
    }

    public String toString() {
        return "Account owner is " + getOwner() + " " +
                "\nCard type: " + getCardType();
    }
}