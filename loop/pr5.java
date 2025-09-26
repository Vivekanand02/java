package loop;
import java.util.*;
public class pr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number :");
        int num=sc.nextInt();
        int facto=1;
        for(int i=1;i<=num;i++){
            facto*=i;
            
        }sc.close();
        System.out.println(facto);
    }
}
