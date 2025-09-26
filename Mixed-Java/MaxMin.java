import java.util.Scanner;
class MaxMin{
	static Scanner sc=new Scanner(System.in);
	static int first=sc.nextInt();
	static int second=sc.nextInt();
	static int third=sc.nextInt();
	static void maxM(){
		
if(first==second || second==third || first==third)	
        System.out.print("Don't take same inputs");
		else if(first>second && first>third)
			System.out.print(first+" is maximum");
		else if(second>first && second>third)
			System.out.print(second+" is maximum");
		else 
			System.out.print(third+" is maximum");
		}
		static void minM(){
		
        if(first==second || second==third || first==third)	
        System.out.print("Don't take same inputs");
		else if(first<second && first<third)
			System.out.print(first+" is minimum");
		else if(second<first && second<third)
			System.out.print(second+" is minimum");
		else 
			System.out.print(third+" is minimum");
		}
	public static void main(String[] args){
		maxM();
		System.out.println();
		minM();
	}
}