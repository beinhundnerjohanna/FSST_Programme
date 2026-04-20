package com.exampl;

public class Main {
    public static void main(String[] args) {
        int[] a = {2,4,6,8,10,12,14};

        System.out.println(sum(a, 0));
    }

    public static int sum(int[] a, int i){

        if(i>=a.length){
            return 0;
        }else{
            return a[i] + sum(a,i+1);
        }
    }
}