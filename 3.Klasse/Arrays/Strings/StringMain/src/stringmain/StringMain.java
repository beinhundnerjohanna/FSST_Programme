package stringmain;

import java.util.Scanner;

public class StringMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;

        a = "Hello";

        System.out.println("a: " + a);

        b = a + "World";    //Zeigerzuweisung
        System.out.println("b: " + b);
        
        /*String über Tastatur einlesen:
        
        System.out.println("Gib etwas ein: ");
        String s1= sc.nextLine();               //String bis zum ENTER wird eingelesen 
        System.out.println("s1: "+s1);
        
        
        if(s1.equals("Hello")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        */
        
        String s= "a long String";
        int len = s.length();
        
        System.out.println("Länge: " +len);
        
        char ch = s.charAt(3);
        System.out.println("ch: "+ ch);
    }

}
