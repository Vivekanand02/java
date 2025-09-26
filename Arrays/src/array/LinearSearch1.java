package arrays;
import java.util.Scanner;
public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int numbers[]=new int[size];
        
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for (int i = 0; i <size; i++) {
            if(numbers[i]==x){
                System.out.print(i);
            }
        }
        sc.close();
    }
   
}
