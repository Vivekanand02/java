package loop;

import java.util.Scanner;

public class powerr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
		System.out.print("Enter the Base Number :");
		int base = input.nextInt();        
		
		int result = 1;
		for(int i = 1; i <= base; i++)
		{
			result *= base;
		}
 input.close();
		System.out.println("Result: "+ result);
    }
}
