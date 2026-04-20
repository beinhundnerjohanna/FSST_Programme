package aufgabe1;

public class Aufgabe1Arrays {

    static void invert(int[]a){
        int zwspr;
        int j = a.length-1;
        
        for(int i = 0; i< a.length/2; i++, j--){
            zwspr = a[i];
            a[i]=a[j];
            a[j] = zwspr;
        }
    }
    
    public static void main(String[] args) {
        
        int[] prim = {2,4,5,7,11,13,17,19,23,29};
        
        invert(prim);
        
        for(int i=0;i<prim.length;i++){
            System.out.println(prim[i]);
        }
    }   
}