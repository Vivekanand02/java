package loop;
import java.util.Scanner;
public class pr11 {
    public static void main(String[] args) {
        int d=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        System.out.println();
        for(int i=1; i<=10;i++){
        d=num*i;
        System.out.println(d);
        }sc.close();
    }
}
