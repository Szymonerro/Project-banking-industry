package org.example.operations;

import org.example.account.Account;

public class CheckBalance extends Transaction {
                                                        //METODA STATYCZNA
    public static void checkBalance (Account account) {
        System.out.println("Current balance: " + account.getBalance() + " PLN\n");
    }
}
