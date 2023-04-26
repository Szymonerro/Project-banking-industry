package org.example.card;

public class CreditCard extends Card implements Color {

    public CreditCard(String cardType, String owner, String color4) {
        super(cardType, owner);
    }

    public CreditCard () {

    }

    public String toString() {
        return "Account owner is " + getOwner() + " " +
                "\nCard type: " + getCardType() +
                "\nCard color: " + color4;
    }
}