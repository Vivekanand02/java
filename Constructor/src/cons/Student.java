/*
public class Cons_student {



    Cons_student() {
        System.out.println("Default Constructor called");
    }

    Cons_student(int id) {
       System.out.println("Constructor with ID called: " + id);
    }

    Cons_student(int id, String name) {
       System.out.println("Constructor with ID and Name called: " + id + ", " + name);
    }


    Cons_student(int id, String name, int age) {
       System.out.println("Constructor with ID, Name, and Age called: " + id + ", " + name + ", " + age);
    }

    Cons_student(int id, String name, int age, String course, double grade) {
      System.out.println("Constructor with all details called: " + id + ", " + name + ", " + age + ", " + course + ", " + grade);
    }


    void display() {
        System.out.println();
    }

    public static void main(String[] args) {

        Cons_student s1 = new Cons_student();  
        Cons_student s2 = new Cons_student(101);
        Cons_student s3 = new Cons_student(102, "Raj");
        Cons_student s4 = new Cons_student(103, "Aman", 20);
        Cons_student s5 = new Cons_student(104, "Priya", 21, "Java", 8.5);


        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
*/
package cons;

public class Student {
    int roll;
    String name;
    int age;

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        System.out.println(s1.age);

        s1.name ="John Doe";
        s1.roll = 1001;
        s1.age = 20;

        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.age);

        
    }
}