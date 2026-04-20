package matrizenrechnung;

import java.util.Scanner;

public class Matrizenrechnung {
    
    static void print(int[][] a){
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[][] matrixAdd(int[][] a, int[][] b) {
        int[][] c = new int[2][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    
    static int[][] scalarProduct(int[][]a, int x){
        
        int[][] d = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                d[i][j]=a[i][j]*x;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x;
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] b = {
            {7, 8, 9},
            {10, 11, 12}
        };
        int [][] c = matrixAdd(a,b);
        int [][] d;
        
        print(c);
        
        System.out.println("Gib das Skalarprodukt ein: ");
        x = sc.nextInt();
        
       d = scalarProduct(c,x);
       
       print(d);

    }

}
