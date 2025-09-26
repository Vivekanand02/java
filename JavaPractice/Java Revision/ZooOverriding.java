package polymorphism;
class Animal{
    void makeSound(){
        System.out.println("Some generic animal sound...");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bark!");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Meow!");
    }
}


public class ZooOverriding {
    public static void main(String[] args) {
        Animal myAnimal;
        myAnimal=new Dog();
        myAnimal.makeSound();

        myAnimal=new Cat();
        myAnimal.makeSound();
    }
}
