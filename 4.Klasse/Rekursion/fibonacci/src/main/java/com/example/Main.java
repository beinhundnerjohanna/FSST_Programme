package com.example;

public class Main {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("Nach " + a + " Monate sind es: " + fibo(a) + " Kaninchenpaare");
    }

    public static int fibo(int n) {
        if (n <= 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
}