package com.example;

public class Main {
    public static void main(String[] args) {
        
        //Table erzeugen
        HashTable ht = new HashTable(13);

        //Elemente einfügen
        ht.put(new HashTableEntry("ANDI"));
        ht.put(new HashTableEntry("INDA"));
        ht.put(new HashTableEntry("SUSI"));
        ht.put(new HashTableEntry("OTTO"));

        ht.print();

        //Elemente suchen
        System.out.println(ht.find("ANDI"));    //"ANDI"
        System.out.println(ht.find("MITZI"));   //"Nicht enthalten" = null
    }
}