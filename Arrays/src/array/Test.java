package arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        //Bubble Sort
      Scanner sc=new Scanner(System.in);
      System.out.print("Unsorted elements are :");
      int[]a=new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        int temp;
        // for (int i = 0; i < a.length; i++) {
        //     int flag=0;
        //     for (int j = 0; j < a.length-1-i; j++) {
        //         if(a[j]>a[j+1]){
        //             temp=a[j];
        //             a[j]=a[j+1];
        //             a[j+1]=temp;
        //             flag=1;
        //         }     
                          
        //     }
        //     if(flag==0){
        //         break;
        //     }
         //Selection Sort
        for (int i = 0; i < a.length; i++) {
                int x=i;
                for (int j = i+1; j < a.length; j++) {
                    if(a[j]<a[x]){
                        x=j;
                    }
                   
                }
                temp=a[i];
                a[i]=a[x];
                a[x]=temp;
                    
                }
        
            for(int i:a){
                System.out.print(i+" ");
            }
            sc.close();
    }
}

