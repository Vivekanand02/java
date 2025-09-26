/*1️⃣ Banking System (Simple)
✔ Users can deposit, withdraw, and check balance.
✔ Handle errors like:

InsufficientBalanceException when withdrawing more than available balance.

InvalidAmountException for negative deposits or withdrawals.*/
import java.util.Scanner;
/*class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message){
	super(message);
	}
}
	class InvalidAmountException extends Exception{
		public InvalidAmountException(String message){
			super(message);
		}
	}*/
class BankingSystem{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int totalMoney;
	int depositMoney;
	int withdrawMoney;
	int checkBalance;
		while(true){
			System.out.println("1.Deposit money.");
			System.out.println("2.Withdraw money.");
			System.out.println("3.Check balance .");
			System.out.println("4.Exit.");
		
		int choice=input.nextInt();
		switch(choice){
			case 1:deposit();
			break;
			case 2: withdraw();
			break;
			case 3: checkBalance();
			break;
			case 4: System.exit(0);
			default :System.out.print("invalid input!!!");
		}
		}
	public void deposit(){
		
		System.out.print("Enter amount you want to deposit :");
		depositMoney=input.nextInt();
		System.out.print("Deposit Money :"+(depositMoney+totalMoney));
	}
	public  void withdraw(){
		
		System.out.print("Enter amount you want to withdraw :");
		withdrawMoney=input.nextInt();
		System.out.print("Withdraw Money :"+(totalMoney-withdrawMoney));
	}
	public  void checkBalance()
	{
		System.out.print(checkBalance);
	}
}
}
