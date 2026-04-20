package com.example;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        Reader r = new Reader();
        p.start();
        r.start();

    }
}