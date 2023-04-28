package org.example.card;
import org.example.people.Customer;

public abstract class Card {
    protected Customer customer;
    protected long cardNumber;

    public Card(Customer customer, long cardNumber) {
        this.customer = customer;
        this.cardNumber = cardNumber;
    }

    public Card () {
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String toString() {
        return "Card owner: " + customer +
                "\nCard number: " + cardNumber;
    }
}