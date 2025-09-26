class SpecialNumber{
 public static void main(String[] args){
	 
	 int num=98;
	 int temp=num;
	 int digit;
	 int sum=0;
	 int mul=1;
	 while(temp>0){
		 digit=temp%10;
		 sum+=digit;
		 mul*=digit;
		 temp/=10;
	 }
	 int result=sum+mul;
	 if(result==num)
		 System.out.println("Special Number");
 }
}