package arrays;

import java.util.Arrays;

public class Copy {
    static void printArray(int[] a ){
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []a=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        printArray(a);
        int[]a2=Arrays.copyOf(a,2);
        
        System.out.println();
        printArray(a2);
        // a2[0]=1;
        // a2[1]=1;
           }
}
    
