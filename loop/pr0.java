package loop;
import java.util.Scanner;
public class pr0 {
    public static void main(String[] args) {
       Scanner console=new Scanner(System.in);
       int number;int d;         
       int countPositive = 0;
       int countZero = 0;
        System.out.print("Enter the number ");
        number = console.nextInt();
        while(number!=0){
            d=number%10;
            if(d > 0)
            {
                countPositive++;
            }
            else{
                countZero++;
            }console.close();
            number=number/10;
        }System.out.println("positive number ="+countPositive);
        System.out.println("total zeros ="+countZero);
    }
}
