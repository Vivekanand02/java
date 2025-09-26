package encapsulation;
import java.util.Scanner;
class Cons {
	Scanner scanner=new Scanner(System.in);
	private Integer rollNo;
	private String name;
	private String subject;
	private Float marks;
	
	Cons(Integer rollNo,String name,String subject,Float marks){
		this.rollNo=rollNo;
		this.name=name;
		this.subject=subject;
		this.marks=marks;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public Float getMarks() {
		return marks;
	}
public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int exit=4;
		 while (exit > 0) {
	            
	            System.out.print("Enter roll number : ");
	            int rollNo = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            System.out.print("Enter name : ");
	            String name = scanner.nextLine();

	            System.out.print("Enter subject : ");
	            String subject = scanner.nextLine();

	            System.out.print("Enter marks : ");
	            float marks = scanner.nextFloat();

	            
	            Cons cons = new Cons(rollNo, name, subject, marks);

	           
	            System.out.println("\nStudent Details:");
	            System.out.println("Roll No: " + cons.getRollNo());
	            System.out.println("Name   : " + cons.getName());
	            System.out.println("Subject: " + cons.getSubject());
	            System.out.println("Marks  : " + cons.getMarks());
	            System.out.println("----------------------");

	            exit--; 
	        }
	        scanner.close(); // Close the scanner
}
}


