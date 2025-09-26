package arrays;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the elements of an array : ");
            int[] a=new int[5];
            for (int i = 0; i < a.length; i++) {
                a[i]=sc.nextInt();
            }
        int temp;
       for (int i = 0; i < a.length; i++) {
        int flag=0;
        for (int j = 0; j < a.length-1-i; j++) {
            if (a[j]>a[j+1]) {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=1;
            }
        }
        if (flag==0) {
            break;
        }
       }
       System.out.println();
       System.out.print("Sorted elements are : ");
       for (int i :a) {
        System.out.print(i+" ");
       }
       sc.close();
    }
}
