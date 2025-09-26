package loop;
import java.util.Scanner;
public class facto {
    public static void main(String[] args) {
        int facto=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number :");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            facto*=i;
            System.out.println(facto);
        }sc.close();

    }
}
