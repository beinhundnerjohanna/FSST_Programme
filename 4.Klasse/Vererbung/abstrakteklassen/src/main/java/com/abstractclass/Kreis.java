package com.abstractclass;

public class Kreis extends Figur{
    double r;

    Kreis(double r){
        this.r=r;
    }
    public double getUmfang(){
        return Math.PI * r * 2;
    }
    
    public double getFlaeche(){
        return Math.PI * r * r;
    }
}
