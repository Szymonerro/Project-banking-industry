package org.example.account;
import org.example.interfaces.AccountLimits;
import org.example.people.Customer;
import org.example.enums.AccountType;

public class BusinessAccount extends Account implements AccountLimits {
    private final Customer company;
    private final AccountType accountType;
    private static final int WITHDRAWAL_LIMIT = 10;
    private static final int MAX_DAILY_TRANSFERS = 10;
    private static final double MAX_DAILY_TRANSFER_AMOUNT = 50000;


    public BusinessAccount(Customer company, AccountType accountType, long accountNumber, double balance) {
        super(company, accountNumber, balance);
        this.company = company;
        this.accountType = accountType;
    }

    @Override
    public double withdrawalLimit() {
        return WITHDRAWAL_LIMIT;
    }
    @Override
    public int maxDailyTransfers () {
        return MAX_DAILY_TRANSFERS;
    }
    @Override
    public double maxDailyTransferAmount () {
        return MAX_DAILY_TRANSFER_AMOUNT;
    }

    public AccountType getAccountType() {
        return accountType;
    }
    public Customer getCompany() {
        return company;
    }

    public String toString() {
        return "Account owner: " + getCompany().getCompanyName() +
                "\nAccount number: " + getAccountNumber() +
                "\nAccount type: " + getAccountType() +
                "\nBalance: " + getBalance() + " PLN";
    }

}