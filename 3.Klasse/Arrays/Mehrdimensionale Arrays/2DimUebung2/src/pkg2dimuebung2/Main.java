package pkg2dimuebung2;

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

        int[][] table = new int[5][10];

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = i * j;
            }
        }

        print(table);
    }

}
