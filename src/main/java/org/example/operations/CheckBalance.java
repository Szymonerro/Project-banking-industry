package org.example.operations;

import org.example.account.Account;

public final class CheckBalance extends Transaction  {

    public static void checkBalance (Account account) {
        System.out.println("Current balance: " + account.getBalance() + " PLN\n");
    }
}
