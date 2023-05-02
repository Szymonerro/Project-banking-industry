package org.example;

import org.example.account.*;
import org.example.card.CreditCard;
import org.example.card.DebitCard;
import org.example.enums.*;
import org.example.operations.*;
import org.example.people.BankEmployee;
import org.example.people.BankManager;
import org.example.people.Customer;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank ("Lloyds Bank", "Main branch", "Percival Court 22, London, UK");

        Customer customer = new Customer("Szymon", "Rosiak", 27, "Lazurowa 12");
        Customer customer1 = new Customer("Izabela", "Kowalska", 26, "Prosta 51");
        Customer customer2 = new Customer("Izabela", "Kowalska", 26, "Prosta 51");
        Customer company = new Customer("Solvd", 11743254, "Jerozolimskie 100");
        BankEmployee bankEmployee = new BankEmployee ("Wojciech", "Krawczyk", 26, "Sowińskiego 14", 101, Position.CUSTOMER_SERVICE);
        BankManager bankManager = new BankManager("Krzysztof", "Mazur", 40, "Szkolna 16", 112, Position.BRANCH_MANAGER);

        BankAccount bankAccount = new BankAccount (Title.MR, customer, AccountType.PRIVATE, 482711000023456L, 2000);
        SavingsAccount savingsAccount = new SavingsAccount(Title.MRS, customer1, AccountType.SAVINGS, 231238723136912L, 5, 5000);
        InvestmentAccount investmentAccount = new InvestmentAccount(Title.MR, customer, AccountType.INVESTMENT, 5353529874324L, 8, 10000);
        BusinessAccount businessAccount = new BusinessAccount(Title.COMPANY, company, AccountType.BUSINESS, 6767112212121111L, 70000);

        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        Transfer transfer = new Transfer ();


        CreditCard creditCard = new CreditCard(CardType.CREDIT_CARD, 69696976969L, customer, Color.GOLD);
        DebitCard debitCard = new DebitCard(CardType.DEBIT_CARD, 76768696969696L, customer, Color.SILVER);

        Loan loan = new Loan(10000, 10);


        System.out.println("\n********** BANK DETAILS **********\n");
        System.out.println(bank + "\n");

        System.out.println("********** CUSTOMERS **********\n");
        System.out.println(customer + "\n");
        System.out.println(customer1 + "\n");
        System.out.println(company + "\n");

        System.out.println("********** BANK ACCOUNTS **********\n");
        System.out.println(bankAccount + "\n");
        System.out.println(savingsAccount + "\n");
        System.out.println(investmentAccount + "\n");
        System.out.println(businessAccount + "\n");

        System.out.println("********** CARDS **********\n");
        System.out.println(creditCard + "\n");
        System.out.println(debitCard + "\n");


        System.out.println("********** TRANSACTIONS **********\n");
        deposit.deposit(bankAccount, 100);
        deposit.deposit(bankAccount, -40);
        deposit.deposit(bankAccount, 100);
        deposit.deposit(businessAccount, 50, "Test deposit");
        withdraw.withdraw(businessAccount, -10);
        withdraw.withdraw(businessAccount, 80000);
        CheckBalance.checkBalance(bankAccount);
        transfer.transfer(bankAccount, savingsAccount, 200);

        // System.out.println(transactionHistory + "\n");

        System.out.println("********** WORKERS **********\n");
        System.out.println(bankEmployee + "\n");
        System.out.println(bankManager + "\n");

        System.out.println("********** OTHERS **********\n");
        System.out.println(loan + "\n");

        System.out.println("\n********** COMPARISON - equals() **********\n");
        System.out.println("customer1.equals(customer2): " + customer1.equals(customer2)); // true
        System.out.println("customer.equals(customer2): " + customer.equals(customer2)); // false

        System.out.println("\n********** COMPARISON - equals() **********\n");
        System.out.println("customer.hashCode(): " + customer.hashCode()); // unique value
        System.out.println("customer1.hashCode(): " + customer1.hashCode()); // unique value
        System.out.println("customer2.hashCode(): " + customer2.hashCode()); // same value as customer1.hashCode()

    }
}

