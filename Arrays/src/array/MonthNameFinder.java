import java.util.Scanner;
class MonthNameFinder{
	public static void main(String[] args){
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to month name finder");
			System.out.print("Enter the month no. ");
		while(true){
			
	
		int month=input.nextInt();
		switch(month){
			        case 1 : System.out.println("January");
					break;
					case 2 : System.out.println("Febuary");
					break;
					case 3 : System.out.println("March");
					break;
					case 4 : System.out.println("April");
					break;
					case 5 : System.out.println("may");
					break;
					case 6 : System.out.println("june");
					break;
					case 7 : System.out.println("July");
					break;
					case 8 : System.out.println("August");
					break;
					case 9 : System.out.println("September");
					break;
					case 10 : System.out.println("October");
					break;
					case 11 : System.out.println("November");
					break;
					case 12 : System.out.println("December");
					break;
					default :System.out.println("Enter the valid number");
					
		}
		            System.out.println("Do you want me to continue? ");
					System.out.println("click 1 to continue");
					System.out.println("click 2 to Exit");
					int val=input.nextInt();
					if(val==2){
					System.out.println("Thank you");
					break;
					}
				     
					
		}
	}
}