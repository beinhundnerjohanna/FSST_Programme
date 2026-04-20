package matrixmultiplikation;

public class Matrixmultiplikation {

    static void print(int[][] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] matrixMult(int[][] a, int[][] b) {
        int[][] c = new int [3][3]; //new int[a.length][b[0].length];
 

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                c[i][j] =  c[i][j] + (a[i][j] * b[j][i]);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        int[][] c = matrixMult(a, b);

        print(c);

    }

}
