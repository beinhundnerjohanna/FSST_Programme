package com.abstractclass;

public class Main {
    public static void main(String[] args) {
        Figur figuren[] = {
            new Rechteck(2.5,4),
            new Quadrat(2),
            new Kreis(1)
        };

        double flaechen = 0;
        for(Figur f : figuren){
           flaechen += f.getFlaeche();
        }

        System.out.println(flaechen);
    }
}