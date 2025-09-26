package loop;
import java.util.*;
public class loops {
    public static void main(String[] args) {
        // int i;
       
        Scanner xc= new Scanner (System.in);
        int n=xc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp=b;
            b= b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
        xc.close();
        // System.out.println("Enter three numbers");
        //  int a=xc.nextInt();
        //  int b=xc.nextInt();
        //  int c=xc.nextInt();
        // // for(i=1;i<=n;i++){
        // //     System.out.println(i);
        // // }
            
        //     int max= Math.max(c, Math.max(a,b));
        //     System.out.print(max);
    }
    
}
