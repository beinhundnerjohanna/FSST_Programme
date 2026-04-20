package com.example;

public class CharStack {
    CharNode start;

    public void push(char data) {
        CharNode n = new CharNode(data);
        push(n);
    }

    public void push(CharNode n) {
        n.next = start;
        start = n;
    }

    public CharNode pop() {
        CharNode tmp = start;
        start = start.next;
        tmp.next = null;

        return tmp;
    }
}
