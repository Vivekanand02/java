package animal;

public class Main {
	public static void main(String[] args) {
		Animal animal=new Cat();
		animal.sound();
		
		Cat cat=(Cat) animal;
		cat.sound();
		
		animal=new Dog();
		animal.sound();	
		
		Dog dog=(Dog) animal;
		dog.sound();
	}
}
