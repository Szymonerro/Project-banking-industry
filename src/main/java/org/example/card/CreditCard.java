package org.example.card;
import org.example.enums.CardType;
import org.example.enums.Color;
import org.example.people.Customer;

public class CreditCard extends Card {
    Color color;
    CardType cardType;

    public CreditCard(CardType cardType, long cardNumber, Customer customer, Color color) {
        super(customer, cardNumber);
        this.color = color;
        this.cardType = cardType;
    }

    public CreditCard () {

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Account owner: " + customer.getFirstName() + " " + customer.getLastName() +
                "\nCard number: " + cardNumber +
                "\nCard type: " + cardType +
                "\nCard color: " + color;
    }
}