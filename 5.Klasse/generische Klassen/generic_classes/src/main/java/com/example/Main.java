package com.example;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<Integer>(); 
        intBox.setValue(22);
        intBox.print();

        Box<String> sBox = new Box<String>("Hansi");
        sBox.print();

        Box<Produkt> PBox = new Box<Produkt>(new Produkt("Plunder", 2.80));
        PBox.print();
    }
}