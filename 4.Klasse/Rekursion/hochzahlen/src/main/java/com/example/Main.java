package com.example;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int x = 3;

        System.out.println( x + " hoch "+a+" ist " + pow(x,a));
    }
    public static int pow(int x, int n){
        if(n==0) return 1;
        if(n==1) return x;


        
        return 0;
    }
}

