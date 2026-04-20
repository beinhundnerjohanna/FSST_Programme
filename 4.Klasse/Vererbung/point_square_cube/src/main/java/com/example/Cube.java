package com.example;

public class Cube extends Square {
    int d;

    public Cube(int x, int y, int l, int d){
        super(x,y,l);
        this.d=d;
    }

    public Cube(){
        this(0,0,1,1);
    }

    @Override
    public String toString(){
        String info;
        info = super.toString();
        info += "; d= "+d;
        return info;
    }

    public int area(){
        return super.area()*2+this.l*this.d*4;
    }
 
    public int volume(){
        return super.area()*this.d;
    }
}
