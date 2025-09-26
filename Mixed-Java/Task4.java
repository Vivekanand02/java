class Task4{
	static void mod()
	{
		int num1=10;
		int num2=20;
		int mod=num1%num2;
		System.out.println(mod);
	}
	void mod2(int num1,int num2){
		int mod=num1%num2;
		System.out.println(mod);
	}
	public static void main(String[] args){
		mod();
		Task4 task=new Task4();
		task.mod2(20,30);
	}
}
