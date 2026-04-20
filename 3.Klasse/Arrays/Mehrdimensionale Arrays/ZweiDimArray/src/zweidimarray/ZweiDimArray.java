
package zweidimarray;

public class ZweiDimArray {

    static void print(int[][] a)
    {
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            int[][] a;
            a=new int[4][3];
            /*
            oder:
            int[][] a=new int[4][3];
            */
            a[2][0]=1;
            
            print(a);
            
            int[][] b={
                {2,4,5},
                {9,5,7}
            };
            print(b);
    }
    
}
