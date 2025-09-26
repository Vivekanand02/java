package fruit;

public class Main {

	public static void main(String[] args) {
		Fruit fruit=new Mango();
		fruit.price();
		
		Mango mango=(Mango) fruit;
		mango.price();
		
		fruit=new Apple();
		fruit.price();
		
		Apple apple=(Apple) fruit;
		apple.price();

	}

}
