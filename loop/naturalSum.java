package loop;
import java.util.Scanner;
public class naturalSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Write the nth term :");
        int num=sc.nextInt();
        for (int i = 1; i <=num; i++) {
            sum=sum+i;
            System.out.println(sum);
        }sc.close();
    }
}
