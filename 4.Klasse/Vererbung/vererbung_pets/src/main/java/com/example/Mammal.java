package com.example;

public class Mammal extends Animal{
    int legs;

    Mammal(String name, int legs){
        super(name);
        this.legs=legs;
    }

    Mammal(){
        super();
        legs=4;
    }

    public void makeSound(){
        System.out.println("Mammals make sounds.");
    }

    public void makeSound(String specificSound){
        System.out.println("This mammal makes: "+specificSound);
    }

}
