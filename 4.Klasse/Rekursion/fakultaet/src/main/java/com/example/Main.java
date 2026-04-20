package com.example;

public class Main {
    public static void main(String[] args) {
        int a = 4;

        System.out.println("Die Fakultät von "+a+" ist "+fakult(a));
    }

    public static int fakult (int n){
        if(n==1){
            return 1;
        }
        else{
            return n * fakult(n-1);
        }
    }
}  