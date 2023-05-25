package org.example.card;
import org.example.account.Account;
import org.example.enums.CardBrand;
import org.example.enums.CardType;
import org.example.enums.Color;
import org.example.interfaces.IBlockCard;
import org.example.people.Customer;

public abstract class Card implements IBlockCard {
    protected Customer customer;
    protected Account account;
    CardBrand cardBrand;
    Color color;
    CardType cardType;
    protected long cardNumber;
    private boolean blocked = false;

    public Card(CardType cardType, Customer customer, long cardNumber, Color color, Account account, CardBrand cardBrand) {
        this.color = color;
        this.cardType = cardType;
        this.customer = customer;
        this.cardNumber = cardNumber;
        this.account = account;
        this.cardBrand = cardBrand;
    }

    public Card (){

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