package com.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    
        //Anlegen
        Person[] persons = {new Person("Josefine", 12), 
                            new Person("Petersilie", 22), 
                            new Person("Lea", 4)};

        //Sortieren
        Arrays.sort(persons);

        //Ausgeben
        for(Person p:persons){
            System.out.println(p.name + ", " + p.age);
        }
    }
}