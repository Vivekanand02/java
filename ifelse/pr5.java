package ifelse;
import java.util.*;
public class pr5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Age if 1st person");
        int a=sc.nextInt();
        System.out.println("Age if 2nd person");
        int b=sc.nextInt();
        System.out.println("Age if 3rd person");
        int c =sc.nextInt();
        if((a>b) && (a>c)){
            System.out.println("A is the Oldest : "+a);
         } else if((b>a) && (b>c)){
            System.out.println("B is Oldest : "+ b);
        }else if((c>a) && (c>b)){
            System.out.println("C is Oldest : "+ c);
        }
        sc.close();


    }
}
