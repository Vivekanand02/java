class Digit{
	public static void main(String[] args){
		int num=31790;
		int digit=0;
		while(num>0){
			digit=num%10;
			System.out.println(digit);
			num/=10;
		}
	}
}