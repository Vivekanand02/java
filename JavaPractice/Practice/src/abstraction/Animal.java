package abstraction;


/*
 * 1. Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.
 */
  public abstract class Animal {
	abstract void sound();
    }
     class Tiger extends Animal
    {
	public void sound()
	{
		System.out.println("Warfing");
	  }
    }
		class Lion extends Animal
		{
			public void sound() 
			{
				System.out.println("Roaring");
			}
		}
		
	class Run
	{
	public static void main(String[] args) {
		Animal animal=new Tiger();
		animal.sound();
		Animal animal1=new Lion();
		animal1.sound();
		
	}
	}