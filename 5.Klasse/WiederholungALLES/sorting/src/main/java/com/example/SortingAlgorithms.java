package com.example;

public class SortingAlgorithms {

    /**
     * Gibt das Array aus
     * 
     * @param a Array, dass ausgegeben wird
     */
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + i + "]:" + a[i]);
        }
        System.out.println();
    }

    // Für generische Typen
    public static <T> void printArray(T[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + i + "]: " + a[i]+" ");
        }
        System.out.println();
    }

    /**
     * Überprüfen ob ein int-Array sortiert ist
     * 
     * @param a Array aus int Werten
     * @return true, wenn sortiert, false, wenn nicht sortiert
     */
    public static boolean isSorted(int[] a) {

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) // ist z.B. das zweite Element kleiner als das erste ist das Array nicht
                                 // sortiert --> false
                return false;
        }
        return true;
    }

    // Für generische Typen
    @SuppressWarnings("unchecked")
    public static <T extends Comparable> boolean isSorted(T[] a) {

        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(a[i - 1]) < 0) // ist z.B. das zweite Element kleiner als das erste ist das Array nicht
                                              // sortiert --> false
                return false;
        }
        return true;
    }

    /**
     * Impementierung mit Generics
     * 
     * @param <T>
     * @param a   Array von Objekten einer Klasse, die das Comparable Interface
     *            implementiert
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable> void bubble(T[] a) {

        T tmp;

        for (int i = a.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Sortiert ein int-Array mittels BubbleSort
     * 
     * @param a int-Array, dass sortiert wirc
     * @return
     */
    public static int bubbleSort(int[] a) {

        int tmp;
        int anzahl = 0;

        for (int i = a.length; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                anzahl++;
                if (a[j] > a[j + 1]) {
                    tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

        return anzahl;
    }

    /**
     * Selection Sort - Es wird immer das kleinste Element gesucht und in die erste
     * Stelle eingesetzt
     * 
     * @param a Array, das sortiert wird
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable> void selectionSort(T[] a) {

        T tmp;

        for (int i = 0; i < a.length; i++) {
            int idx = i;
            for (int j = i; j < a.length; j++) {
                if (a[j].compareTo(a[idx]) < 0) {
                    idx = j;
                }
            }

            if (a[i].compareTo(a[idx]) != 0) {
                tmp = a[i];
                a[i] = a[idx];
                a[idx] = tmp;
            }

        }

    }

    public static <T extends Comparable> void quicksort(T[] a, int lo, int hi) {
        // Abbruch, wenn nur mehr ein Element angesehen werden muss --> REKURSIV!!!!
        if (hi > lo) {

            // Aufteilen:
            // - Alle kleiner -> links vom pivot
            // - Alle größere -> rechts vom pivot
            // - pivot ist dann der index, um den es geht
            int pivot = partition(a, lo, hi);

            // 1. Teil-Array mit den kleineren Werten wieder sortieren
            quicksort(a, lo, pivot - 1);

            // 2. Teil-Array mit den größeren Werten wieder sortieren
            quicksort(a, pivot + 1, hi);

        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable> int partition(T[] a, int lo, int hi) {
        // 1. Pivot festlegen 
        T pivot = a[lo];

        // 2. Zwei Zähler aufeinander zulaufen lassen
        // Linker Zähler 
        int i = lo + 1; 
        // Rechter Zähler 
        int j = hi; 

        while (true) {
            // Linker Zähler stop wenn > Pivot
            while (i <= hi && a[i].compareTo(pivot) <= 0) {
                i++;
            }

            // Rechter Zähler stop wenn < Pivot
            while (j >= lo && a[j].compareTo(pivot) > 0) {
                j--;
            }

            // Abbruch-Bedingung
            if (i >= j) {
                break;
            }

            // Vertauschen 
            T temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        // 3. Pivot an richtige Stelle setzen
        // j zeigt auf Element <= pivot
        T temp = a[lo];
        a[lo] = a[j];
        a[j] = temp;

        // 4. Position des Index zurückgeben
        return j;

    }
}
