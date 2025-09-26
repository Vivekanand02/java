class DigitSum{
	public static void main(String[] args){
	int num=5246135;
	int sum=0;
	int digit;
	while(num>0){
		digit=num%10;
		sum+=digit;
		num/=10;
	}
	System.out.println(sum);
}
}