package com.abstractclass;

public class Rechteck extends Figur {
    double a;
    double b;

    Rechteck(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double getUmfang(){
        return (2*a)+(2*b);
    }
    
    public double getFlaeche(){
        return a*b;
    }
}
