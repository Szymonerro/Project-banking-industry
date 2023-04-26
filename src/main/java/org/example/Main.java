package org.example;

import org.example.account.BankAccount;
import org.example.account.BusinessAccount;
import org.example.card.Color;
import org.example.operations.Transaction;
import org.example.operations.TransactionHistory;
import org.example.operations.Withdraw;
import org.example.people.BankEmployee;
import org.example.people.BankManager;
import org.example.account.SavingsAccount;
import org.example.card.DebitCard;
import org.example.card.CreditCard;
import org.example.people.Customer;
import org.example.account.InvestmentAccount;
import org.example.operations.Deposit;
import org.example.operations.Withdraw;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank ("Lloyds Bank", "Main branch", "Percival Court 22");

        //BankAccount bankAccount = new BankAccount ("Izazbela", "Kamola", 482711000023456L, "Private Account", 2000);
        //SavingsAccount savingsAccount = new SavingsAccount("Michał", "Zawistowski", 231238723136912L, "Savings Account", 5000, 5);
        //InvestmentAccount investmentAccount = new InvestmentAccount("Karol", "Wróbel", 5353529874324L, "Investment Account", 100000, 8);
       // BusinessAccount businessAccount = new BusinessAccount("Dorota", "Rosiak", 6767112212121111L, "Business Account", 10000);

        Customer customer = new Customer("Szymon", "Rosiak", 27, "Lazurowa 12");
        BankAccount bankAccount1 = new BankAccount (customer, 888868669678L, "Private Acc", 87586558 );
        BankEmployee bankEmployee = new BankEmployee ("Wojciech", "Krawczyk", 26, "Sowińskiego 14", 007);
        BankManager bankManager = new BankManager("Krzysztof", "Mazur", 40, "Szkolna 16");

        Transaction transaction = new Transaction("International transfer");
        TransactionHistory transactionHistory = new TransactionHistory("International transfer", 88);
        Deposit wplata1 = new Deposit (585875858758L);
        Deposit wplata2 = new Deposit (585858587585L, 5000);
        Deposit wplata3 = new Deposit (676586586546L, 5000, 10);
        Withdraw wyplata1 = new Withdraw(48476575858585L, 1000, 10);


        CreditCard creditCard = new CreditCard("Credit Card", "Łukasz Lewandowski", Color.color4 );
        DebitCard debitCard = new DebitCard("Debit Card", "Monika Nowak");

        Loan loan = new Loan(10000, 10);


        System.out.println("\n********** BANK DETAILS **********\n");
        System.out.println(bank);

        System.out.println("\n********** BANK ACCOUNTS **********\n");
       // System.out.println(bankAccount);
       // System.out.println(savingsAccount);
        //System.out.println(investmentAccount);
        //System.out.println(businessAccount);

        System.out.println("\n********** PEOPLE **********\n");
        System.out.println(customer);
        System.out.println(bankEmployee);
        System.out.println(bankManager);

        System.out.println("\n********** TRANSACTIONS **********\n");
        System.out.println(transaction);
        System.out.println(transactionHistory);
        System.out.println(wplata1);
        System.out.println(wplata2);
        System.out.println(wplata3);
        System.out.println(wyplata1);

        System.out.println("\n********** CARDS **********\n");
        System.out.println(creditCard);
        System.out.println(debitCard);

        System.out.println("\n********** OTHERS **********\n");
        System.out.println(loan);


    }
}

