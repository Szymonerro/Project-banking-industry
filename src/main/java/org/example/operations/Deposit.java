package org.example.operations;

public class Deposit {
    private long accNum;
    private long saldo;
    private long amount;

    // Constructor with 1 parameter
    public Deposit(long accNum) {
        this.accNum = accNum;
    }

    // Constructor with 2 parameters
    public Deposit(long accNum, long saldo) {
        this.accNum = accNum;
        this.saldo = saldo;
    }

    //Constructor with 3 parameters

    public Deposit(long accNum, long saldo, long amount){
        this.accNum = accNum;
        this.saldo = saldo;
        this.amount = amount;
    }

    public Deposit() {

    }

    // Deposit method
    public double wplata(long amount) {
        return saldo += amount;
        }

    // Overloaded method with additional parameter - opis transakcji
    public double wplata(long amount, String opis) {
        return saldo += amount;
        }


    public String toString() {
        return "Account number: " + accNum +
                "\nDeposit: " + amount +
                "\nSaldo: " + saldo + " PLN";
    }
}

