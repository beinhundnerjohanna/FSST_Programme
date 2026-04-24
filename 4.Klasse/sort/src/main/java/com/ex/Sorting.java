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
            System.out.print("["+i+"]: "+a[i]);
        }

        System.out.println();
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

    public static void merge_sort(int[] a){
        merge_sort(a, 0, a.length-1);
    }

    private static void merge_sort(int[] a, int start, int end) {
        if (start < end) {
            // Berechne die Mitte
            int mid = start + (end - start) / 2;

            // Linke und rechte Hälfte rekursiv sortieren
            merge_sort(a, start, mid);
            merge_sort(a, mid + 1, end);

            // Die sortierten Hälften zusammenführen
            merge(a, start, mid, end);
        }
    }

    private static void merge(int[] a, int start, int mid, int end) {
        // Größen der temporären Teil-Arrays berechnen
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Temporäre Arrays erstellen
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Daten in die temporären Arrays kopieren
        for (int i = 0; i < n1; ++i)
            left[i] = a[start + i];
        for (int j = 0; j < n2; ++j)
            right[j] = a[mid + 1 + j];

        // Indizes für das Mergen
        int i = 0, j = 0;
        int k = start;

        // Elemente vergleichen und zurück in das Original-Array schreiben
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        // Restliche Elemente von left kopieren (falls vorhanden)
        while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }

        // Restliche Elemente von right kopieren (falls vorhanden)
        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    public static void insertion_sort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            int j = i;

            while (j > 0 && a[j - 1] > a[j]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;

                j--;
            }
        }
    }
}
