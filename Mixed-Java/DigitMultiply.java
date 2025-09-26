class DigitMultiply{
	public static void main(String[] args){
		int num=2516342;
		int multiply=1;
		int digit;
		while(num>0){
			digit=num%10;
			multiply*=digit;
			num/=10;
		}
		System.out.println(multiply);
	}
}