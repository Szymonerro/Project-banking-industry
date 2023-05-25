package org.example.account;
import org.example.interfaces.IAccountLimits;
import org.example.people.Customer;
import org.example.enums.AccountType;

public class BusinessAccount extends Account implements IAccountLimits {
    private final Customer company;

    public BusinessAccount(Customer company, long accountNumber, double balance) {
        super(company, AccountType.BUSINESS, accountNumber, balance);
        this.company = company;
    }

    @Override
    public void changeWithdrawalLimit(int newLimit) {
        this.withdrawalLimit = newLimit;
    }

    @Override
    public void changeMaxDailyTransfers(int newLimit) {
        this.maxDailyTransfers = newLimit;
    }

    @Override
    public void changeMaxDailyTransferAmount(double newLimit) {
        this.maxDailyTransferAmount = newLimit;
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