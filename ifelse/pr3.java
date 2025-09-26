package ifelse;
import java.util.*;
public class pr3 {
    public static void main(String[] args) {
        int i=100;
        int cost=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Give me the quatity");
        int a=sc.nextInt();
        sc.close();
         cost=a*i;
         if(cost>1000){
            System.out.println(cost-(10*cost/100));
        }else{
            System.out.println(cost);
        }
    }
}
