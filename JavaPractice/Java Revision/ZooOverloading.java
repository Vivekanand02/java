
class Animal{
    void makeSound(){
        System.out.println("This animal Speaks!");
    }
    void makeSound(String animalName){
        System.out.println(animalName +" makes unique sound!");
    }
}
public class ZooOverloading {
    public static void main(String[] args) {
    Animal animal=new Animal();
    animal.makeSound();
    animal.makeSound("Lion");
}
}
