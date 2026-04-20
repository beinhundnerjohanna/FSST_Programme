package com.example;

public abstract class Fahrzeug {
    String marke;
    String modell;
    int baujahr;

    Fahrzeug(String marke, String modell, int baujahr){
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    abstract void beschleunigen();

    public String getDetails(){
        return "Marke: "+marke+" Modell: "+modell+" Baujahr: "+baujahr;
    }
}
