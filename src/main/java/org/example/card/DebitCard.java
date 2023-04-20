package org.example.card;

public class DebitCard extends Card {

    public DebitCard(String cardType, String owner) {
        super(cardType, owner);
    }

    public String toString() {
        return "Account owner is " + getOwner() + " " +
                "\nCard type: " + getCardType();
    }
}
