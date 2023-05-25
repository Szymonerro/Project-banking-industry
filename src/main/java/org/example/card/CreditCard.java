package org.example.card;
import org.example.account.Account;
import org.example.enums.CardBrand;
import org.example.enums.CardType;
import org.example.enums.Color;
import org.example.interfaces.IBlockCard;
import org.example.people.Customer;

public class CreditCard extends Card implements IBlockCard {

    private boolean blocked = false;

    public CreditCard(long cardNumber, Customer customer, Color color, Account account, CardBrand cardBrand) {
        super(CardType.CREDIT, customer, cardNumber, color, account, cardBrand);
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
        return "Credit card owner: " + customer.getFirstName() + " " + customer.getLastName() +
                "\nCard number: " + cardNumber +
                "\nCard brand: " + cardBrand +
                "\nCard type: " + cardType +
                "\nCard color: " + color;
    }
}