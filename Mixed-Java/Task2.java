class Task2{
	static void sub()
	{
		int num1=10;
		int num2=20;
		int sub=num1-num2;
		System.out.println(sub);
	}
	void sub2(int num1,int num2){
		int sub=num1-num2;
		System.out.println(sub);
	}
	public static void main(String[] args){
		sub();
		Task2 task=new Task2();
		task.sub2(20,30);
	}
}
