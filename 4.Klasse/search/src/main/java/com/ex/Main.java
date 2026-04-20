package com.ex;

public class Main {
    public static void main(String[] args) {
        int size = 1024;
        int[] arr = new int[size];
        int[] arr2 = { 2, 4, 6, 8, 10, 12, 16, 18 };
 
        for (int i = 0; i < size; i++) {
            arr[i] = (i + 1) * 2;
        }

        // Testarray Ausgabe
        // printArray(arr);

        //Linear:
        System.out.println("index:" + search(arr, 2000));

        //Binär:
        System.out.println("bin. index:" + binSearch(arr, 2000));

        //Binär Rekursiv:
        System.out.println(binSearchRec(arr2, 12, 0, arr2.length - 1));
    }

    //lineare Suche
    static int search(int[] a, int val) {

        for (int i = 0; i < a.length; i++) {
            if (val == a[i]) {
                return i;
            }
        }

        return -1;
    }

    //Binäre Suche mit Rekursion
    static int binSearchRec(int[] a, int val, int start, int end) {
        int mid = (start + end) / 2;

        if(start>end){
            return -1;
        }
        
        if (val == a[mid]) {
            return mid;
        } else if (val < a[mid]) {
            return binSearchRec(a, val, start, mid - 1);
        } else {
            return binSearchRec(a, val, mid + 1, end);
        }
    }

    //Binäre suche (immer halbieren)
    static int binSearch(int[] a, int val) {
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;

        while (start < end) {
            System.out.println("start: " + start + " mid: " + mid + " end: " + end);
            if (val == a[mid]) {
                return mid;
            } else if (val < a[mid]) {
                end = mid - 1;
                mid = (start + end) / 2;
            } else {
                start = mid + 1;
                mid = (start + end) / 2;
            }
        }

        return -1;
    }

    //Ausgabe Array
    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}