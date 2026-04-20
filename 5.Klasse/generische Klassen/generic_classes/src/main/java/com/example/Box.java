package com.example;

public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public Box() { 
        this.value = null;
    }

    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void print(){
        System.out.println("Value: "+value);
    }
}
