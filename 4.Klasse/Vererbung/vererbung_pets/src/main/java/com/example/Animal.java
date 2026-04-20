package com.example;

public class Animal {
    String name;

    Animal (String name){
        this.name=name;
    }

    Animal(){
        this("Mathilda");
    }

    public void makeSound(){
        System.out.println("Animals make sounds.");
    }
}
