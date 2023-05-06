package org.example.operations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.account.Account;
import org.example.exceptions.*;

public class Transfer extends Transaction {

    private static final Logger LOGGER = LogManager.getLogger(Transfer.class);
    private final Withdraw withdraw;
    private final Deposit deposit;

    public Transfer() {
        this.withdraw = new Withdraw();
        this.deposit = new Deposit();
    }

    public void transfer(Account from, Account to, double amount) throws InsufficientFundsException, TransferLimitExceededException, TransfersAmountLimitException, WrongAmountException, TransferFailedException {
        if (from.getDailyTransfersCount() >= from.maxDailyTransfers()) {
            LOGGER.warn("Daily transfers limit exceeded for account " + from.getAccountNumber());
            throw new TransferLimitExceededException("Daily transfers limit exceeded for account " + from.getAccountNumber());
        }
        if (amount <= 0) {
            LOGGER.warn("Amount must be greater than zero");
            throw new WrongAmountException("Amount must be greater than zero\n");
        }
        if (amount > from.getBalance()) {
            LOGGER.warn("Insufficient funds");
            throw new InsufficientFundsException("Insufficient funds\n");
        }
        if (from.getDailyTransfersAmount() + amount > from.maxDailyTransferAmount()) {
            LOGGER.warn("Daily transfer amount limit exceeded for account " + from.getAccountNumber());
            throw new TransfersAmountLimitException("Daily transfer amount limit exceeded for account " + from.getAccountNumber());
        }
        try {
            from.ignoreUpdateWithdrawalLimitCount();
            withdraw.withdraw(from, amount);
            deposit.deposit(to, amount);
            from.updateDailyTransfersCount();
            from.updateDailyTransfersAmount(amount);
            System.out.println("Transfer from account " + from.getAccountNumber() + " to account " + to.getAccountNumber() + " completed successfully\n");
            LOGGER.info("Transfer from account " + from.getAccountNumber() + " to account " + to.getAccountNumber() + " completed successfully");
        } catch (Exception e) {
            // balance change cancelled
            deposit.deposit(from, amount);
            withdraw.withdraw(to, amount);
            LOGGER.error("Transfer failed: " + e.getMessage(), e);
            throw new TransferFailedException("Transfer failed: " + e.getMessage());
        }
    }
}







//Dodać:
//private String opis;
//// Overloaded method with additional parameter - transaction description
//public final void transfer(Account account, double amount, String opis)
//        this.opis = opis;
//        System.out.println("Account number: " + account.getAccountNumber() +
//        "\nBalance before operation: " + getBalanceBefore() + " PLN" +
//        (...)
//        "\nTitle: " + getOpis() +