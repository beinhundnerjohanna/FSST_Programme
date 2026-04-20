package com.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String line;
        BufferedReader file;

        try {
            file = new BufferedReader(new FileReader("file_reader//data.txt"));

            while ((line = file.readLine()) != null) {
                System.out.println(line);
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden!");
        } catch (IOException e) {
            System.out.println("IO Fehler: " + e.getMessage());
        }

        System.out.println("Fertig");

        // Nullpoint exception:
        try {
            int[] arr = new int[] { 1, 2, 3, 4, 5 };

            for (int i = 0; i <= arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}