package com.example;

public class Konto { 
    double kontostand;

    public Konto(double kontostand) {
        this.kontostand = kontostand;
    }

    public synchronized void abheben(double geld){
        while(geld>kontostand){
            System.out.println("main wartet... ");
            try {
                wait();
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
        kontostand = kontostand - geld;
    }

    public synchronized void einzahlen(double geld){
        kontostand = kontostand + geld;
        notify();
    }
}
