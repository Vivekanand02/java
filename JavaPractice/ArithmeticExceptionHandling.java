import java.util.Scanner;
class ArithmeticExceptionHandling{
	 public static void divide(int first, int second){
			try{
			int div=first/second;
			System.out.print(div +": of two numbers");
		}
		 
		catch(ArithmeticException e){
			System.out.print(e);
		}
	 }
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter First number :");
		int first=input.nextInt();
		System.out.print("Enter the second number :");
		int second=input.nextInt();
		 divide(first,second);
		 }
	

}