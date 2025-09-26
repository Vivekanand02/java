package composition;

class Demo {

	private Integer num=100;
	void display()
	{
		A obj=new A();
		obj.show();
	}
	class A{
		void show(){
			System.out.println("hello "+num);
		}
		
	}
	public static void main(String[] args) {
		Demo demo=new Demo();
		demo.display();
	}
}
