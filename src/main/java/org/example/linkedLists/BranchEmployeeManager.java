package org.example.linkedLists;

import org.example.Bank;
import org.example.people.BankEmployee;

public class BranchEmployeeManager {
    private final BankEmployee employee;
    private final Bank branch;
    private final BranchEmployeeManager next;

    public BranchEmployeeManager(BankEmployee employee, Bank branch) {
        this.employee = employee;
        this.branch = branch;
        next = null;
    }

    public void showEmployeesInBranch(Bank branch) {
        BranchEmployeeManager current = this;
        while (current != null) {
            if (current.getBranch().equals(branch)) {
                System.out.println(current.getEmployee().toString() + "\n");
            }
            current = current.getNext();
        }
    }

    public BankEmployee getEmployee() {
        return employee;
    }

    public Bank getBranch() {
        return branch;
    }

    public BranchEmployeeManager getNext() {
        return next;
    }
}

