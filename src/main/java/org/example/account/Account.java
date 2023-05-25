package org.example.account;

import org.example.card.Card;
import org.example.enums.AccountType;
import org.example.interfaces.IAccountLimits;
import org.example.people.Customer;

public abstract class Account implements IAccountLimits {
    protected Customer customer;
    private final long accountNumber;
    protected final AccountType accountType;
    private double balance;
    private int dailyTransfersCount;
    private double dailyTransfersAmount;
    private int withdrawalLimitCount;
    protected int withdrawalLimit = 10;
    protected int maxDailyTransfers = 10;
    protected double maxDailyTransferAmount = 10000;
    protected Card card;

    public Account(Customer customer, AccountType accountType, long accountNumber, double balance) {
        this.customer = customer;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void updateWithdrawalLimitCount() {
        setWithdrawalLimitCount(getWithdrawalLimitCount() + 1);
    }

    public void ignoreUpdateWithdrawalLimitCount() {
        setWithdrawalLimitCount(getWithdrawalLimitCount() - 1);
    }

    public void updateDailyTransfersCount() {
        setDailyTransfersCount(getDailyTransfersCount() + 1);
    }

    public void updateDailyTransfersAmount(double amount) {
        setDailyTransfersAmount(getDailyTransfersAmount() + amount);
    }

    public void setCard(Card card) {
        this.card = card;
    }

    @Override
    public void changeWithdrawalLimit(int newLimit) {
        withdrawalLimit = newLimit;
        System.out.println("Daily withdrawal limit changed successfully.\n" +
                "New limit: " + withdrawalLimit + "\n");
    }

    @Override
    public void changeMaxDailyTransfers(int newLimit) {
        maxDailyTransfers = newLimit;
        System.out.println("Daily transfer limit changed successfully.\n" +
                "New limit: " + maxDailyTransfers + "\n");

    }

    @Override
    public void changeMaxDailyTransferAmount(double newLimit) {
        maxDailyTransferAmount = newLimit;
        System.out.println("Daily transfer amount limit changed successfully.\n" +
                "New limit: " + maxDailyTransferAmount + "\n");
    }

    public int getWithdrawalLimitCount() {
        return withdrawalLimitCount;
    }

    public void setWithdrawalLimitCount(int withdrawalLimitCount) {
        this.withdrawalLimitCount = withdrawalLimitCount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDailyTransfersCount() {
        return dailyTransfersCount;
    }

    public void setDailyTransfersCount(int dailyTransfersCount) {
        this.dailyTransfersCount = dailyTransfersCount;
    }

    public double getDailyTransfersAmount() {
        return dailyTransfersAmount;
    }

    public void setDailyTransfersAmount(double dailyTransfersAmount) {
        this.dailyTransfersAmount = dailyTransfersAmount;
    }

    @Override
    public String toString() {
        return "Account number: " + getAccountNumber() +
                "\nBalance: " + getBalance() + " PLN";
    }

    public int getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public int getMaxDailyTransfers() {
        return maxDailyTransfers;
    }

    public double getMaxDailyTransferAmount() {
        return maxDailyTransferAmount;
    }
}