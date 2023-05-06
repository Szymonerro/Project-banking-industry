package org.example.account;

import org.example.card.Card;
import org.example.interfaces.AccountLimits;
import org.example.people.Customer;

public abstract class Account implements AccountLimits {
    protected Customer customer;
    private final long accountNumber;
    private double balance;
    private int dailyTransfersCount;
    private double dailyTransfersAmount;
    private int withdrawalLimitCount;
    private static final int WITHDRAWAL_LIMIT = 10;
    private static final int MAX_DAILY_TRANSFERS = 0;
    private static final double MAX_DAILY_TRANSFER_AMOUNT = 0;
    protected Card card;

    public Account(Customer customer, long accountNumber, double balance) {
        this.customer = customer;
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
    public double withdrawalLimit() {
        return WITHDRAWAL_LIMIT;
    }

    @Override
    public int maxDailyTransfers() {
        return MAX_DAILY_TRANSFERS;
    }

    @Override
    public double maxDailyTransferAmount() {
        return MAX_DAILY_TRANSFER_AMOUNT;
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
}
