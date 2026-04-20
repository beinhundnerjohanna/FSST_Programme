package com.example;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Hansi","Hinterseher", 54);

       // System.out.println( p.makeJSON());

        Addressbuch ab = new Addressbuch();
        ab.addAddress(p);
        ab.addAddress(new Person("Eva","Berger", 12));
        ab.addAddress(new Person("Josef","Meier", 99));

        System.out.println(ab.makeJson());
    }
}