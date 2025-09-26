package designPatterns;

public class Demo {

	private Demo() {}
		void m1() {
			System.out.println("Hello");
		}
		public static Demo getDemoObject() {
			return new Demo();
		}
	}

	class Run{
	public static void main(String[] args) {
		Demo demo=Demo.getDemoObject();
		demo.m1();
		
	}

}

