package sms;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<>();
	int increment = 1;

	public void addStudent(String name, String course) {
		students.add(new Student(increment++, name, course));
		System.out.println("Student added Successfully!!!");
	}

	public void view() {
		if (students.isEmpty()) {
			System.out.println("Empty");
			return;
		}
		System.out.println("Student list :");
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}

	public void update(int id, String name, String course) {
		for (Student student : students) {
			if (student.getId() == id) {
				students.set(students.indexOf(student), new Student(id, name, course));
				System.out.println("Student details updated.");
				return;
			}
		}
		System.out.println("Student Id not found.");
	}

	public void remove(int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				students.remove(student);
				System.out.println("Student Removed.");
				return;
			}

		}
		System.out.println("Student id not found.");

	}
}
