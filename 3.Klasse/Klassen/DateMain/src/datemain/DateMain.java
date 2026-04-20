/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datemain;

public class DateMain {

    public static void main(String[] args) {
        Date x, y;

        //Ein Objekt erzeugen:
        x = new Date();

        x.day = 13;
        x.month = "November";
        x.year = 2023;

        System.out.println(x.day + ". " + x.month + " " + x.year);
    }

}
