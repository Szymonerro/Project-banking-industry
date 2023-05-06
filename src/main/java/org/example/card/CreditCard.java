package org.example.card;
import org.example.account.Account;
import org.example.enums.CardType;
import org.example.enums.Color;
import org.example.interfaces.BlockCard;
import org.example.people.Customer;

public class CreditCard extends Card implements BlockCard {
    Color color;
    CardType cardType;
    private boolean blocked = false;

    public CreditCard(CardType cardType, long cardNumber, Customer customer, Color color, Account account) {
        super(customer, cardNumber, account);
        this.color = color;
        this.cardType = cardType;
        this.account = account;
    }

    @Override
    public void block() {
        blocked = true;
        System.out.println("Card is blocked!");
    }
    @Override
    public void unblock() {
        blocked = false;
        System.out.println("Card is unblocked!");
    }
    @Override
    public boolean isBlocked() {
        return blocked;
    }

    @Override
    public String toString() {
        return "Account owner: " + customer.getFirstName() + " " + customer.getLastName() +
                "\nCard number: " + cardNumber +
                "\nCard type: " + cardType +
                "\nCard color: " + color;
    }
}