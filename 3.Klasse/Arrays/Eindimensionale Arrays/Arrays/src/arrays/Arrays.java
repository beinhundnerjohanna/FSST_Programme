package arrays;

import java.util.Scanner;

public class Arrays {
    
    static int search(int[] primes, int x){
        for(int i = 0; i< primes.length; i++)
        {
            if(primes[i]==x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] primes = {2,4,5,7,11};
        int[] a = new int[5];
        
        for(int i=0;i<a.length;i++){
            //a[i]=sc.nextInt();
            System.out.println(primes[i]);
        }
        
        System.out.println("Index= "+ search(primes,3));
        
    }
}
