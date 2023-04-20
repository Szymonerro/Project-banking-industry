package org.example;

import org.example.account.BankAccount;
import org.example.account.BusinessAccount;
import org.example.people.BankEmployee;
import org.example.people.BankManager;
import org.example.account.SavingsAccount;
import org.example.card.DebitCard;
import org.example.card.CreditCard;
import org.example.people.Customer;
import org.example.account.InvestmentAccount;

public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank ("Lloyds Bank", "Main branch", "Percival Court 22");
        BankAccount bankAccount = new BankAccount ("Izazbela", "Kamola", 482711000023456L, "Private Account", 2000, 3);
        Customer customer = new Customer("Szymon", "Rosiak", 27, "Lazurowa 12");
        BankEmployee bankEmployee = new BankEmployee ("Wojciech", "Krawczyk", 26, "Sowińskiego 14", 007);
        BankManager bankManager = new BankManager("Krzysztof", "Mazur", 40, "Szkolna 16");
        Transaction transaction = new Transaction("International transfer");
        TransactionHistory transactionHistory = new TransactionHistory("International transfer", 88);
        SavingsAccount savingsAccount = new SavingsAccount("Michał", "Zawistowski", 231238723136912L, "Savings Account", 5000, 5);
        InvestmentAccount investmentAccount = new InvestmentAccount("Karol", "Wróbel", 5353529874324L, "Investment Account", 100000, 8);
        BusinessAccount businessAccount = new BusinessAccount("Dorota", "Rosiak", 6767112212121111L, "Business Account", 10000, 4);
        CreditCard creditCard = new CreditCard("Credit Card", "Łukasz Lewandowski");
        DebitCard debitCard = new DebitCard("Debit Card", "Monika Nowak");
        Loan loan = new Loan(10000, 10);



        System.out.println(bank);
        System.out.println(bankAccount);
        System.out.println(customer);
        System.out.println(bankEmployee);
        System.out.println(bankManager);
        System.out.println(transaction);
        System.out.println(transactionHistory);
        System.out.println(savingsAccount);
        System.out.println(businessAccount);
        System.out.println(creditCard);
        System.out.println(debitCard);
        System.out.println(loan);


    }
}

