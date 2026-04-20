package com.example;

import java.util.Scanner;

public class Reader extends Thread {
    private Scanner sc = new Scanner(System.in);

    private char getNextCharacter(){
        return sc.next().charAt(0);
    }

    @Override
    public void run() {
        while (Printer.running) {
            char c = getNextCharacter();
            Printer.ch = c;

            if (c == 'X') {
                Printer.running = false;
            }
        }
    }
}

