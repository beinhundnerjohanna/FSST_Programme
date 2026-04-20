package com.example;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    

    // JSON Repräsentation erzeugen
    String makeJSON() {
        String jstring = "{\n\"firstName\":" + "\"" + firstName + "\"";
        jstring+= ",\"lastName\":" + "\"" + lastName + "\"";
        jstring+= ",\"age\": " + age + "}";


        return jstring;
    }
}
