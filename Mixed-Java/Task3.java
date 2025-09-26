class Task3{
	static void mul()
	{
		int num1=10;
		int num2=20;
		int mul=num1*num2;
		System.out.println(mul);
	}
	void mul2(int num1,int num2){
		int mul=num1*num2;
		System.out.println(mul);
	}
	public static void main(String[] args){
		mul();
		Task3 task=new Task3();
		task.mul2(20,30);
	}
}
