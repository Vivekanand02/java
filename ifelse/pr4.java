package ifelse;
import java.util.*;
public class pr4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Years of service : ");
        int year=in.nextInt();
        System.out.println("Enter your Salary : ");
        int salary=in.nextInt();
        in.close();
        if(year>5){
            System.out.println("Total Salary : " + (salary*5/100 + salary));
        }else{
            System.out.println("Experience must be less than 5 years!!!");
        }in.close();
    }
    
}
