package com.example;

public class IntStack {
    IntNode start;

    public void push(int data) {
        IntNode newNode = new IntNode(data);
        push(newNode);
    }

    public void push(IntNode newNode) {
        newNode.next = start;
        start = newNode;
    }

    public IntNode pop() {
        IntNode tmp = start;
        start = start.next;
        tmp.next = null;

        return tmp;
    }
}