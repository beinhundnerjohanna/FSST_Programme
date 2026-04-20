package com.example;

public class Main {
    public static void main(String[] args) {
        // CharacterWriterThread plus = new CharacterWriterThread('+',20);
        // CharacterWriterThread star = new CharacterWriterThread('*',20);
        // CharacterWriterThread minus = new CharacterWriterThread('-',20);
 
       // plus.start();
       // star.start();
       // minus.start();

        for(int i = 0; i< 20; i++){
            System.out.print(".");
        }  

        System.out.println();

        Konto kto = new Konto(1000);
        KontoChangeThread kct1 = new KontoChangeThread(1000, 1000, kto);
        KontoChangeThread kct2 = new KontoChangeThread(1000, 1000, kto);

        try {
            kct1.join();
            kct2.join();
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Kontostand am Ende: "+kto.kontostand);

        kct1.start();

        kto.abheben(1000);
        kto.einzahlen(3000);

        System.out.println(kto.kontostand);
    }
}