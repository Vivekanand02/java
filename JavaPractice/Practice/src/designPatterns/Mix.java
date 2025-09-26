package designPatterns;

public class Mix {
	
	void m1() {
		System.out.println("Hello");
	}
}
  class Run88{
	public static void main(String[] args) {
		try {
			Class<?> c=Class.forName("designPatterns.Mix");
			Mix mix=(Mix)c.getDeclaredConstructor().newInstance();
			mix.m1();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
