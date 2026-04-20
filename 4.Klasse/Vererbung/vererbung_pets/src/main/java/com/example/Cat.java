package com.example;

public class Cat extends Mammal {
    boolean hasClaws;

    Cat(){
        super();
        hasClaws=true;
    }

    Cat(boolean hasClaws, int legs, String name){
        super(name, legs);
        this.hasClaws=hasClaws;
    }

    public void makeSound(){
        super.makeSound("Miau!");
    }
}
