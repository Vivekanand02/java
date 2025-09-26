package teacher;

public class Teacher {
		private int id;
		private String name;
		private String subject;
		private double salary;
		public Teacher(int id, String name, String subject, double salary) {
			
			this.id = id;
			this.name = name;
			this.subject = subject;
			this.salary = salary;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getSubject() {
			return subject;
		}
		public double getSalary() {
			return salary;
		}
	
}
