package com.example;

public class Main {
    public static void main(String[] args) {
        int[] a = {2,4,6,5,3};

        System.out.println("Summe aller Zahlen: "+sum(a,0));
    }

    public static int sum(int[] a, int i){
        
        if(i==a.length-1) return a[i];
         
        return sum(a,i+1) + a[i]; 
    }
}