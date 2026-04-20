package com.example;

public class HashTableEntry {
    int key;        //Schlüssel (ID)

    //gespeicherte Werte:
    String country;         //shiftedSum => key
    int population;

    //Zeiger zum nächsten Wert:
    HashTableEntry next;

    public HashTableEntry(String country, int population){
        key = shiftedSum(country);
        this.country = country;
        this.population = population;
        next = null;
    }

    public int sum(String entry){
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

    public void print(){
        System.out.print(this.country+": "+this.population);

        if(this.next ==null){
            System.out.println("--|");
        }else{
            System.out.print("-->");
            this.next.print();
        }
    }
}
