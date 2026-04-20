package com.example;

public class Manager extends Angestellter {
    double bonus;

    //Konstruktor
    public Manager(String name, int personalNummer, double gehalt, double bonus){
        super(name,personalNummer,gehalt);
        this.bonus = bonus;
    }

    @Override public void informationenAusgeben(){
        super.informationenAusgeben();
        System.out.println("| Bonus: "+bonus);
    }
}
