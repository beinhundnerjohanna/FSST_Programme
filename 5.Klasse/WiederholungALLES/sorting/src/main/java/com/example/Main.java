package com.example;

public class Main {
    public static void main(String[] args) {

        //Demodaten
        int[] a = {2,4,7,9,112,22456,22456};
        int[] b = {2,4,7,9,22456,112,22456,3,454,1};
 
        System.out.println(SortingAlgorithms.isSorted(a));
        System.out.println(SortingAlgorithms.isSorted(b));

        SortingAlgorithms.printArray(b);
        SortingAlgorithms.bubbleSort(b);
        SortingAlgorithms.printArray(b);

        System.out.println(SortingAlgorithms.isSorted(b));

        //Test Generics
        Double[] da = new Double[]{2.2341,3.1234, 3.435,6.3345};
        SortingAlgorithms.bubble(da);

        Integer[] di = new Integer[]{2,5,4,9,7};
        SortingAlgorithms.bubble(di);

        String[] ds = new String[]{"Hansi","Xaver","Franzi","Eva","Schos"};
        System.out.println(SortingAlgorithms.isSorted(ds));
        SortingAlgorithms.quicksort(ds,0,ds.length-1);
        System.out.println(SortingAlgorithms.isSorted(ds));
        SortingAlgorithms.printArray(ds);

        //Schüler-Klasse
        Student[] s = new Student[]{new Student(3, "Mirjam", 18),
                                    new Student(2, "Laura", 17), 
                                    new Student(1, "Johanna", 19),
                                    new Student(5, "David", 20),
                                    new Student(19, "Glenn", 21),
                                    new Student(13, "Xaver", 5),
                                    new Student(8, "Gerner", 10)};

        SortingAlgorithms.quicksort(s,0,s.length-1);
        SortingAlgorithms.printArray(s);


    }
}