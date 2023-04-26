package org.example.operations;

public class Deposit {
    private String numerKonta;
    private double saldoPoczatkowe;
    private double kwota;

    // Konstruktor z jednym parametrem
    public Deposit(String numerKonta) {
        this.numerKonta = numerKonta;
        this.saldoPoczatkowe = 0.0;
    }

    // Konstruktor z dwoma parametrami
    public Deposit(String numerKonta, double saldoPoczatkowe) {
        this.numerKonta = numerKonta;
        this.saldoPoczatkowe = saldoPoczatkowe;
    }

    // Metoda do wpłaty
    public void wplata(double kwota) {
        saldoPoczatkowe += kwota;
        System.out.println("Wpłata: " + kwota + " PLN");
    }

    // Przeciążona metoda do wpłaty z dodatkowym parametrem - opisem transakcji
    public void wplata(double kwota, String opis) {
        saldoPoczatkowe += kwota;
        System.out.println("Wpłata: " + kwota + " PLN");
        System.out.println("Opis: " + opis);
    }
    

    // Metoda do wyświetlenia informacji o koncie
    public void informacje() {
        System.out.println("Numer konta: " + numerKonta);
        System.out.println("Saldo: " + saldo + " PLN");
    }
}

public class Main {
    public static void main(String[] args) {
        Deposit konto1 = new Deposit ("1234567890");
        konto1.wplata(1000.0);
        konto1.wplata(500.0, "Wpłata z pensji");
        konto1.informacje();
    }
}
