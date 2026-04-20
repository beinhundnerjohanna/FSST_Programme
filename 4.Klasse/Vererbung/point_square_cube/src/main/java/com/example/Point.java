package com.example;

public class Point {
    int x;
    int y;

    public Point (int x, int y){
        this.x =x;
        this.y=y;
    }

    public Point (){
        this(0,0);
    }


    @Override 
    public String toString(){
        String info;
        info = super.toString();
        info += "\n";
        info +="("+x+"|"+y+")";
        return info;
    }
}
