package loop;
import java.util.*;
public class tables {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int i;
    System.out.println("enter any positive value");
     int num=sc.nextInt();
     sc.close();
     for(i=1;i<=10;i++){
        System.out.println(num +" x " + i + " = " + (num*i));
     } 
    
    }
    
}
