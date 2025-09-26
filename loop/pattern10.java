package loop;
import java.util.Scanner;
public class pattern10 {
   public static void print1(int n){
        for (int i =0; i <n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
             for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
             for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void print2(int n){
        for (int i =0; i <n; i++) {
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
             for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
             for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n :"); 
        int n=sc.nextInt();
       sc.close();
        pattern10.print1(n);
        pattern10.print2(n);
        
        
   
}
}
