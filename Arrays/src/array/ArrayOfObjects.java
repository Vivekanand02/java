package arrays;
class Student{
    public String name;
    public int roll;
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] a=new Student[2];
        a[0]=new Student("Vivekanand",1);
        a[1]=new Student("Viveka",2);
        for (Student student : a)
            System.out.println(student.name + " " + student.roll);
    }
}

