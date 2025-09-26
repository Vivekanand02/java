import java.util.Scanner;
class ArrayProblem{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int[] arr={5,3,6,4,2};
		System.out.print("Enter any index :");
	 try{
		 int index=input.nextInt();
		 System.out.print("Element is :"+arr[index]);
	 }
	 catch(ArrayIndexOutOfBoundsException e){
	    System.out.print(e);
	 }
	 finally{
		 input.close();
	 }
	}
}