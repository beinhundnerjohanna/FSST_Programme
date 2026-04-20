package com.example;

public class CharacterWriterThread extends Thread { 
    char c;
    int count;
    public CharacterWriterThread(char c, int count) {
        this.c = c;
        this.count = count;
    }

    public void run(){
        for(int i = 0; i<count; i++){
            System.out.print(c);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Exception");
            }
            
        }
    }
}
