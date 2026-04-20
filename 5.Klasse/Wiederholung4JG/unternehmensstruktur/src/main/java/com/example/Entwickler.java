package com.example;

public class Entwickler extends Angestellter{
    String programmiersprache;

    //Konstruktor
    public Entwickler(String name, int personalNummer, double gehalt, String programmiersprache){
        super(name,personalNummer,gehalt);
        this.programmiersprache = programmiersprache;
    }

    @Override public void informationenAusgeben(){
        super.informationenAusgeben();
        System.out.println("| Programmiersprache: "+programmiersprache);
    }
}
