package com.abstractclass;

public class Quadrat extends Figur{
    double a;

    Quadrat(double a){
        this.a = a;
    }
    public double getUmfang(){
        return a*4;
    }
    
    public double getFlaeche(){
        return a*a;
    }
}
