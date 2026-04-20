package copycolumn;

public class CopyColumn {

    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {0, 4, 0, 0, 0, 0, 0, 0},
            {0, 8, 0, 0, 0, 0, 0, 0},
            {0, 9, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0},
            {0, 7, 0, 0, 0, 0, 0, 0},
            {0, 2, 0, 0, 0, 0, 0, 0}
        };

        for (int j = 0; j < matrix.length; j++) {
            matrix[j][3] = matrix[j][1];
        }

        print(matrix);

    }

}
