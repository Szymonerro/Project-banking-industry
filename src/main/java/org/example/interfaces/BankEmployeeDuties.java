package org.example.interfaces;

import org.example.account.Account;
import org.example.people.Customer;

public interface BankEmployeeDuties {
    public void openNewAccount(Customer customer, Account account);
    public void closeAccount(Customer customer, Account account);

}
