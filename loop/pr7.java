package loop;
import java.util.*;
public class pr7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
       char choice;
       do{
        System.out.print("Enter the first digit :");
        int a =console.nextInt();
        System.out.print("Enter the second digit :");
        int b =console.nextInt();
        int c=a+b;
        System.out.println("The sum is :"+c);
        System.out.println("press y if you want to continue :");
        choice=console.next().charAt(0);
        System.out.println();
        console.close();
       }while((choice=='y')||(choice=='Y'));
       
       
        
     


    }
}
