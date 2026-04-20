package com.example;

public class Square extends Point {
    int l;

    public Square(int x, int y, int l) {
        super(x,y);
        this.l = l;
    }

    public Square(){
        this(0,0,1);
    }


    @Override
    public String toString(){
        String info;
        info = super.toString();
        info +="; l = "+l;
        return info;
    }

    public int area(){
        return l*l;
    }
}
