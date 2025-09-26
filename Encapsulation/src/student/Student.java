package student;

public class Student {
	    private int roll;
		private String name;
		private String subject;
		private double marks;
		
		public Student(int roll,String name,String subject,double marks){
			this.roll=roll;
			this.name=name;
			this.subject=subject;
			this.marks=marks;
		 }
		public int getRoll() {
			return roll;
		}
		public String getName() {
			return name;
		}
		public String getSubject() {
			return subject;
		}
		public double getMarks() {
			return marks;
		}
		
}
