package recursion;
import java.util.Scanner;
public class Factorial {
    int fact=1;
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        n=sc.nextInt();
        Factorial f=new Factorial();
        int res=f.calFact(n);
        System.out.println(res);
        sc.close();
    }
    int calFact(int n){
        if(n>1){
            fact=fact*n;
            calFact(n-1);
            }
        return fact;
       
    }
}
