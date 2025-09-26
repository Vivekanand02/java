class Task1{
	static void sum()
	{
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		System.out.println(sum);
	}
	void sum2(int num1,int num2){
		int sum=num1+num2;
		System.out.println(sum);
	}
	public static void main(String[] args){
		sum();
		Task1 task=new Task1();
		task.sum2(20,30);
	}
}
