package org.example.operations;

public class Withdraw {

    private long accNum;
    private long saldo;
    private long amount;

    public Withdraw (long accNum, long saldo, long amount) {
        this.accNum = accNum;
        this.saldo = saldo;
        this.amount = amount;
    }

    public Withdraw() {

    }

    // Withdraw method
    public void wyplata(double amount) {
        if (saldo >= amount) {
            saldo -= amount;
            System.out.println("Withdraw: " + amount + " PLN");
        } else {
            System.out.println("Not enough money on your account.");
        }
    }

    public String toString() {
        return "Account number: " + accNum +
                "\nBalance after transaction: " + saldo + " PLN";
    }
}
