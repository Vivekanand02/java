class SumProgram{

	static int staticSum(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
		return sum;
	}
	static void square(int result){
		System.out.println(result*result);
	}
	
	public static void main(String[] args){
		int result=staticSum(10,20);
		square(result);	
	}
}