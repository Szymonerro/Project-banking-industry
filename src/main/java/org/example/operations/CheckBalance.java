package org.example.operations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.account.Account;

public final class CheckBalance extends Transaction  {

    private static final Logger LOGGER = LogManager.getLogger(CheckBalance.class);

    public static void checkBalance (Account account) {
        LOGGER.info("Current balance: " + account.getBalance() + " PLN\n");
    }
}
