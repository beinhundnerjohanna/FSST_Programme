package com.example;

public class Printer extends Thread{
    public static char ch = 'c';
    public static volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println(ch);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception");
            }
        }
    }
}
