import java.util.Scanner;
import java.util.InputMismatchException;
class OddException extends Exception{
	public OddException(String message){
		super(message);
	}
}
class Problems{
	public static void sum(){
		Scanner input=new Scanner(System.in);
		
		try{
		System.out.print("Enter first number :");
		int first=input.nextInt();
		System.out.print("Enter second number :");
		int second=input.nextInt();
		int sum=first+second;
		System.out.print(sum);
		}
		catch(InputMismatchException e)
		{
			System.out.print("please enter numeric value only!!!");
		}
		finally{
			input.close();
		}
	}
	public static void odd(int number){
		Scanner input=new Scanner(System.in);
		try{
	System.out.print("Enter the number :");
			int number=input.nextInt();
			if(number%2!=0){
				throw new OddException("Error: Number is odd!!!");
			}
		}
		catch(OddException e){
			System.out.print(e.getMessage());
		}
		
	}
}
class Call{
public static void main(String[] args){
	//Problems.sum();
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	Problems.odd(num);
}

}