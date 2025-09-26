import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message){
		super(message);
	}
}
	class Age{
	public static void invalidAge()throws InvalidAgeException{
		 Scanner input=new Scanner(System.in);
		System.out.print("Enter age :");
		int age = input.nextInt();
		if(age<18)
			throw new InvalidAgeException ("Error : age must be 18 or above to register.");
		else
			System.out.print("Eligible...");
	}
}
class Main{
 public static void main(String[] args){
	try{
	 Age.invalidAge();
	}
	catch(InvalidAgeException e){
		System.out.print(e);
	}
 }
}