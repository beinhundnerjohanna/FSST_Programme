package com.example;

public class Produkt {
    String name;
    double preis;

    public Produkt(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }
 
    @Override
    public String toString() {
        return name + " - $ " + preis;
    }

    
}
