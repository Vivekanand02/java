package cons;

public class con1 {
	int Emp_id;
    String Emp_Name;
    String Emp_dept;
    int Sal;

    public static void main(String[] args) {

        con1 E1 = new con1();
        System.out.println(E1.Emp_id);
        System.out.println(E1.Emp_Name);
        System.out.println(E1.Emp_dept);
        System.out.println(E1.Sal);
        E1.Emp_id= 2123;
        E1.Emp_Name = "John";
        E1.Emp_dept = "Sales";
        E1.Sal = 27000;
        System.out.println(E1.Emp_id);
        System.out.println(E1.Emp_Name);
        System.out.println(E1.Emp_dept);
        System.out.println(E1.Sal);

    }
}
