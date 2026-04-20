package com.example1;

public class Node {

    char data;
    Node next;

    // Konstruktoren
    public Node(char data) {
        this.data = data;
    }

    public Node() {
        this(' ');
    }

    @Override
    public String toString() {
        return "Data: " + data;
    }

}
