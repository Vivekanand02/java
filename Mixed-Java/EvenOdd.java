class EvenOdd{
 public static void main(String[] args){
	 int num=5246139;
	 int digit;
	 while(num>0){
		 digit=num%10;
		 if(digit%2==0){
			 System.out.println(digit+" is an EVEN digit");
		 }
		 else{
			 System.out.println(digit+" is an ODD digit");
		 }
		 num/=10;
	 }
 }
}