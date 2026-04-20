package com.example;

public class Main {
    public static void main(String[] args) {
        
        Manager m = new Manager("Franz", 111, 5000, 500);
        Entwickler e = new Entwickler("Sissi",213, 4350, "Java");
        Praktikant p = new Praktikant("David", 550);

        m.informationenAusgeben();
        e.informationenAusgeben();
        p.informationenAusgeben();
    }
}