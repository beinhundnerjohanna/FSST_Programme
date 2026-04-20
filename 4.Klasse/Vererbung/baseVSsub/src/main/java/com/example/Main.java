package com.example;

public class Main {
    public static void main(String[] args) {
        Base base = new Base();
        System.out.println("base.g()= "+ base.g());

        Sub sub = new Sub();

        System.out.println("sub.f() = " + sub.f());
        System.out.println("sub.g() = " + sub.g());
        System.out.println("sub.h(4) = " + sub.h(4));

        Base sbase = sub;
        System.out.println("sbase.g() = " + sbase.g());
    }
}