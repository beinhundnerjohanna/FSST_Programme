package com.example;

public class Student implements Comparable{
    int katNr;
    String name;
    int age;

    public Student(int katNr, String name, int age) {
        this.katNr = katNr;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object a) {
    Student s = (Student)a;
    // kleiner
    if(katNr < s.katNr) 
        return -1; 
    // größer
    if(katNr > s.katNr) 
        return 1;  
    // gleich
    return 0; 
    }

    @Override
    public String toString(){
        return "Nr: "+this.katNr+" Name: "+this.name+" Alter: "+this.age +"\n";
    }

}
