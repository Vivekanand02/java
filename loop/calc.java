package loop;
import java.util.*;
public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no. :");
        int a = sc.nextInt();
         System.out.println("Enter second no. :");
        int b = sc.nextInt();
        System.out.println("enter any Arithmetic operation(+,-,*,/)");
        String sym=sc.next();
        int res;
        switch(sym)
        {
            case "+": res= a+b;
            System.out.println(res);
            break;
            case "-": res= a-b;
            System.out.println(res);
            break;
            case "*": res= a*b;
            System.out.println(res);
            break;
            case "/": res= a/b;
            System.out.println(res);
            break;
        }
        sc.close();

    }
    
}
