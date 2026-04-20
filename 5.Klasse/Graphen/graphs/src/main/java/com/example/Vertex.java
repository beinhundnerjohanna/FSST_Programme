package com.example;

public class Vertex {

    public String name;

    public Vertex(String name) {
        this.name = name;
    }
    
    @Override
    public String toString (){
        return "( " + this.name + " ) ";
    }
}
