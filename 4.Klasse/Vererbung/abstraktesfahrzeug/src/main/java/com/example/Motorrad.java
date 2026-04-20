package com.example;

public class Motorrad extends Fahrzeug {
    boolean hatBeiwagen;

    public Motorrad(String marke, String modell, int baujahr, boolean hatBeiwagen){
        super(marke, modell, baujahr);
        this.hatBeiwagen = hatBeiwagen;
    }

    public void beschleunigen(){
        System.out.println("Das Motorrad "+marke+" "+modell+" beschleunigt.");
    }
}
