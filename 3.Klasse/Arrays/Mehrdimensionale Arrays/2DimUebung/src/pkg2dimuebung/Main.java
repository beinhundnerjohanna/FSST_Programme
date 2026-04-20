package pkg2dimuebung;

import java.util.Scanner;

public class Main {

    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] data = new int[4][7];

        for (int i = 0; i < data[0].length; i++) {
            data[2][i] = sc.nextInt();
        }

        print(data);
    }

}
