class AnonymousObj{
	void sum(int num1,int num2){
		int sum=num1+num2;
		System.out.print(sum);
	}
	public static void main(String[] args){
		new AnonymousObj().sum(5,6);
	}
}