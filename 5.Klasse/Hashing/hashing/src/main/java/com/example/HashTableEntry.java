package com.example;

public class HashTableEntry {
    int key;        //Schlüssel (ID)
    String value;   //gespeicherter Wert

    public HashTableEntry(String value){
        key = shiftedSum(value);
        this.value = value;
    }

    public static int sum(String entry){
        int code = 0;
        for(int i = 0; i< entry.length(); i++){
            code = code + (int)entry.charAt(i);
        }
        return code;
    }

    public static int shiftedSum(String entry){
        int code = 0;
        for(int i = 0; i< entry.length(); i++){
            code = code*31 + (int)entry.charAt(i);
        }
        return code;
    }
}
