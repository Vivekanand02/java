package composition;

class Test {
	private Integer num=100;
	class A{
		void show() {
			System.out.println("Hi "+num);
		}
	}
}
    class Demo22{
    	public static void main(String[] args) {
			Test test=new Test();
			Test.A a=test.new A();
			a.show();
		}
    }