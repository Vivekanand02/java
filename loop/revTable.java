package loop;
import java.util.Scanner;
public class revTable {
    public static void main(String[] args) {
        int d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        for(int i=10;i>=1;i--){
            d=num*i;
            System.out.println(d);
        }sc.close();
    }
    
}
