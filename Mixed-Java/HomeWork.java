class HomeWork{
	static void sum(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
	}
	static void checkChar(char character){
		if(character>='A' && character<='Z')
			System.out.println("Uppercase character");
		else if(character>='a' && character<='z')
			System.out.println("Lowercase character");
		else if(character>='0' && character<='9')
			System.out.println("digit character");
		else
			System.out.println("Special Character");
	}
	static void evenOdd(int num){
		System.out.println(num%2==0?"Even":"Odd");
	}
	static void sqr(int num){
		int result=num*num;
		System.out.println(result);
	}
	static void ownDetails(int age,String name,long phone,String email,String address,char gender,String profile,float salary,boolean isAvailable,double comm)
	{
		System.out.println(age +" "+name +" "+phone +" "+email +" " +address +" " +gender + " " +profile+" "+salary+" "+isAvailable+ " " +comm);
	}
	public static void main(String[] args){
		sum(10,20);
		checkChar('a');
		evenOdd(56);
		sqr(5);
		ownDetails(23,"Vivekanand",8709931790L,"sharmavivekanand884@gmail.com","gurugram",'M',"Java Developer",87546213,true,65214632);
	}
}