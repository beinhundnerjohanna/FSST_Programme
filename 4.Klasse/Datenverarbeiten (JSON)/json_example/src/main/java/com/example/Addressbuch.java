package com.example;
import java.util.ArrayList;

public class Addressbuch {
    ArrayList<Person> addresses;

    public Addressbuch() {
        addresses = new ArrayList<Person>();
    }

    public void addAddress(Person p){
        addresses.add(p);
    }

    public String makeJson(){
        String jstring= "{ \"addresses\" : [";
        for(Person p: addresses){
            jstring += p.makeJSON() + ",";
        }
        jstring = jstring.substring(0, jstring.length()-1);  
        jstring +="]}";
        
        return jstring;
    }
   
}
