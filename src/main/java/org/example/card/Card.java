package org.example.card;
import org.example.account.Account;
import org.example.interfaces.BlockCard;
import org.example.people.Customer;

public abstract class Card implements BlockCard {
    protected Customer customer;
    protected long cardNumber;
    protected Account account;
    private boolean blocked = false;

    public Card(Customer customer, long cardNumber, Account account) {
        this.customer = customer;
        this.cardNumber = cardNumber;
        this.account = account;
    }

    public String checkOwner () {
        return "The owner of the card with the number " +
                cardNumber + " is: " + customer.getFirstName() + " " + customer.getLastName();
    }

    @Override
    public void block() {
        blocked = true;
    }
    @Override
    public void unblock() {
        blocked = false;
    }
    @Override
    public boolean isBlocked() {
        return blocked;
    }

    public String toString() {
        return "Card owner: " + customer +
                "\nCard number: " + cardNumber;
    }
}