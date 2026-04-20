package com.example;

public class Angestellter {
    private String name;
    private int personalNummer;
    private double gehalt;

    //Getter
    public String getName(){
        return name;
    }
    public int getPersonalNummer() {
        return personalNummer;
    }
    public double getGehalt() {
        return gehalt;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setPersonalNummer(int personalNummer) {
        this.personalNummer = personalNummer;
    }
    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    //Konstruktor 
    public Angestellter(String name, int personalNummer, double gehalt){
        this.name = name;
        this.personalNummer = personalNummer;
        this.gehalt = gehalt;
    }

    //Methoden 
    public void informationenAusgeben(){
        System.out.print("Name: "+ name + "| PersonalNr.: "+personalNummer+"| Gehalt: "+ gehalt);
    }
}
