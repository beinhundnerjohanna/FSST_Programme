package com.example;

public class Auto extends Fahrzeug {
    int anzahlTueren;

    public Auto(String marke, String modell, int baujahr, int anzahlTueren){
        super(marke,modell,baujahr);
        this.anzahlTueren = anzahlTueren;
    }

    public void beschleunigen(){
        System.out.println("Das Auto "+marke+" "+modell+" beschleunigt.");
    }
}
