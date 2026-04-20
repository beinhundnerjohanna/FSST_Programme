package com.ex;

import java.util.*;

public class Sorting {

    public static void shuffleArray(int[] arr) {
        Random rand = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Zufälliger Index

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }

    public static int[] getFilledArray(int size, int step) {
        int[] values = new int[size];

        for (int i = 0; i < values.length; i++) {
            values[i] = i * step;
        }

        return values;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length - 2; i++) {
            if (a[i - 1] > a[i]) {
                return false;
            }
        }
        return true;
    }

    public static void bubbleSort(int[] a) {

        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
    }

    public static void merge_sort(int a[], int start, int end) {

        if ((end - start) < 1)
            return;
        int mid = (start + end) / 2;
        merge_sort(a, start, mid);
        merge_sort(a, mid + 1, end);
        merge(a, start, mid, end); // merge both array parts
    }

    public static void merge(int[] a, int start, int mid, int end){
        if(start>end){
           // int tmp = start;
        }
        
    }

    public static void insertionSort(int[] a){

    }
}
