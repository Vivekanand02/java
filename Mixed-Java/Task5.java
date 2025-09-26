class Task5{
	static void div()
	{
		int num1=10;
		int num2=20;
		int div=num1/num2;
		System.out.println(div);
	}
	void div2(int num1,int num2){
		int div=num1/num2;
		System.out.println(div);
	}
	public static void main(String[] args){
		div();
		Task5 task=new Task5();
		task.div2(20,30);
	}
}
