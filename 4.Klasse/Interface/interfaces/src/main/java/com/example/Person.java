package com.example;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    //Sortieren nach Alter:
    public int compareTo(Person p) {
        if(this.age > p.age){
            return 1;
        }
        else if(this.age < p.age){
            return -1;
        }
    return 0;
    }
    */

    //Sortieren nach Länger der Namen:
    public int compareTo(Person p){
        if(this.name.length() > p.name.length()){
            return 1;
        }
        else if(this.name.length() < p.name.length()){
            return -1;
        }
    return 0;
    }
    
}
