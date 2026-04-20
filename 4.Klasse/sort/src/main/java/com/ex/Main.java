package com.ex;

public class Main {
    public static void main(String[] args) {
       int[] arr = Sorting.getFilledArray(10, 2);

       
       Sorting.shuffleArray(arr);
       Sorting.bubbleSort(arr);

       Sorting.printArray(arr);
       if(Sorting.isSorted(arr)){
        System.out.println("sortiert!");
       }else{
        System.out.println("nicht sortiert!");
       }

    }
}