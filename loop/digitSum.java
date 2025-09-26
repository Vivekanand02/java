package loop;
import java.util.*;
public class digitSum {
    public static void main(String[] args) {
        int sum=0;
        int last=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number :");
        int num=sc.nextInt();
        int temp=num;
        for (int i = 1; i<=temp; i++) {
            last=num%10;
            sum=sum+last;
            temp/=10;

        }System.out.println(sum);
        sc.close();
    }
}
