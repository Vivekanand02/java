package arrays;
class Student{
    public String name;
    public int rollNo;
    Student(String name ,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
}
public class ArrayOfObject {
    public static void main(String[] args) {
        Student[] a=new Student[5];
        a[0]=new Student("Vivekanand",1);
        a[1]=new Student("Vivek",2);
        a[2]=new Student("Vivi",3);
        a[3]=new Student("Viveka",4);
        a[4]=new Student("Vi",5);
        for (int i = 0; i < a.length; i++) 
            System.out.println(a[i].name+" "+a[i].rollNo);
        }
}
