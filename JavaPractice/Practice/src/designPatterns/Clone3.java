package designPatterns;

class Clone3 implements Cloneable {
	
	void show() {
		System.out.println("Hi");
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class Run33{
	public static void main(String[] args) {
		Clone3 clone3=new Clone3();
		try {
			Clone3 clone4=(Clone3)clone3.clone();
			clone4.show();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
