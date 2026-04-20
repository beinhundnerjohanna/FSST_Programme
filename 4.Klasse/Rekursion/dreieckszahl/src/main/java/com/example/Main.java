package com.example;

public class Main {
    public static void main(String[] args) {
        int i = 4;
        System.out.println("Die Dreieckszahl von " + i + " ist: " + dreieck(i));
    }

    public static int dreieck(int n) {
        int dez = 1;
        if (n == 1) {
            return dez;
        } else {
            dez = dreieck(n - 1);
            System.out.println("Die Dreieckszahl von " + (n-1) + " ist: " + dez);
            dez = dez +n;
            System.out.println("Die Dreieckszahl von " + n + " ist: " + dez);
            return dez;
        }
    }
}