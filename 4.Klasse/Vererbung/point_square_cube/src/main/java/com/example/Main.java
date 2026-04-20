package com.example;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        Square s = new Square(0,2,4);
        Cube c= new Cube(1,0,3,2);

        
        System.out.println(p);
        System.out.println(s);
        System.out.println(c);

        System.out.println(s.area());
        System.out.println(c.area());
        System.out.println(c.volume());
    }

}