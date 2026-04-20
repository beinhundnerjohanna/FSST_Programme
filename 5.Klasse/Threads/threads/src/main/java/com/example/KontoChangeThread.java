package com.example;

public class KontoChangeThread extends Thread{
    double betrag;
    int count;
    Konto konto;

    public KontoChangeThread(double betrag, int count, Konto konto) {
        this.betrag = betrag;
        this.count = count;
        this.konto = konto;
    } 

    public void run(){
        for(int i = 0; i<count;i++){
            double betrag = Math.floor(Math.random()*this.betrag);
            konto.einzahlen(betrag);
            konto.abheben(betrag);
        }

        System.out.println(konto.kontostand);
    }
}
