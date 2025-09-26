abstract class Animal{
	abstract void makeSound();
	void sleep(){
		System.out.print("This animal sleeps...");
	}
}
class Tiger extends Animal{
	@Override
	void makeSound(){
		System.out.println("Roars!");
	}
}
public class MainZoo{
	public static void main(String[] args){
		Tiger tiger=new Tiger();
		tiger.makeSound();
		tiger.sleep();
	}
}