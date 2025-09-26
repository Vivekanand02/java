package Inheritance;
 class Animal{
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("Lion roars!");
    }
}
class Elephant extends Animal{
    void trumpet(){
        System.out.println("Elephant trumpets!");
    }
}
public class Zoo{
    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.eat();
        lion.roar();

        Elephant elephant=new Elephant();
        elephant.eat();
        elephant.trumpet();
    }
}
