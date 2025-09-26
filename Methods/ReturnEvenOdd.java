class ReturnEvenOdd{
	static String findEvenOdd(int number){
		return (number%2==0)?"Even":"Odd";
	}
	
	public static void main(String[] args){
		System.out.println(findEvenOdd(52));
	}
}