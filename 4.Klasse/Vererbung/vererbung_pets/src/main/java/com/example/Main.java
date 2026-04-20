package com.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0]= new Animal();
        animals[1]= new Mammal();
        animals[2]= new Dog();
        animals[3]= new Cat();


        Mammal m = new Dog();
        Animal a = new Dog();

        System.out.println();
        System.out.println("compatibility: ");
        m.makeSound();
        a.makeSound();

        System.out.println();
        System.out.println("specific Sound: ");
        m.makeSound("Mooh!");

        System.out.println();
        System.out.println("Animals:");
        for (Animal animal : animals) {
            animal.makeSound();
        }


    }
}