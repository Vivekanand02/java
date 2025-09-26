package arrays;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Unsorted Elements :");
        int []a=new int[4];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.print("Sorted Elements :");
        for(int i:a){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
