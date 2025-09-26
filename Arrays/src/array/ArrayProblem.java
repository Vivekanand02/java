package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem {
    static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int n=sc.nextInt();
        int []a=new int[n];
        System.out.print("Enter "+n+" values :");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }sc.close();
       printArray(a);
       int[] arr=Arrays.copyOf(a,a.length-1);
       printArray(arr);
    }
}
