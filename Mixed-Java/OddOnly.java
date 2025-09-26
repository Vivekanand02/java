class OddOnly{
	public static void main(String[] args){
		int num=253613;
		int digit;
		while(num>0){
			digit=num%10;
			if(digit%2!=0){
				System.out.println(digit);
			}
			num/=10;
		}
	}
}