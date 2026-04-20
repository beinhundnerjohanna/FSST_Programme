package com.example;

public class Main {
    public static void main(String[] args) {
        Fahrzeug fahrzeuge[] ={
            new Auto("VW", "Golf", 2009, 4),
            new Motorrad("Yamaha", "R1", 2020, false),
            new LKW("MAN", "TGX", 2015,20.3)
        };

        System.out.println(fahrzeuge);
    }
}