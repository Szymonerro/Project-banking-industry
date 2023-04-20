package org.example.card;

public abstract class Card {
    private String cardType;
    private String owner;

    public Card(String cardType, String owner) {
        this.cardType = cardType;
        this.owner = owner;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return "Account owner is " + getOwner() + " " +
                "\nCard type: " + getCardType();

    }
}