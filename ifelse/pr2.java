package ifelse;
import java.util.*;
public class pr2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("1st value : ");
        int a=sc.nextInt();
        System.out.println("2nd value : ");
        int b=sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println(a + " is greatest");
        }else{
            System.out.println(b + " is greatest");
        }
        
    }
    
}
