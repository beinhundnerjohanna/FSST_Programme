package com.example;

public class Dog extends Mammal {
    String race;

    Dog(){
        super();
        race="sausage-dog";
    }

    Dog(String race, int legs, String name){
        super(name, legs);
        this.race=race;
    }

    public void makeSound(){
        super.makeSound("Woof!");
    }
}
