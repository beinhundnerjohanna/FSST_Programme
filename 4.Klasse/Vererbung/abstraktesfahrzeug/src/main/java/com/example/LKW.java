package com.example;

public class LKW extends Fahrzeug {
    double ladekapazität;

    public LKW(String marke, String modell, int baujahr, double ladekapazität){
        super(marke,modell,baujahr);
        this.ladekapazität = ladekapazität;
    }

    public void beschleunigen(){
        System.out.println("Der LKW "+marke+" "+modell+" beschleunigt.");
    }
}
