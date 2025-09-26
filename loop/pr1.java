package loop;
import java.util.*;
public class pr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no :");
        int a =sc.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(a+ " X" +" "+ i +" =" +" "+i*a);
        }sc.close();
    }

    
}
