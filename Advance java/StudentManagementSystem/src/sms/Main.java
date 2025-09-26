package sms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StudentManager sm = new StudentManager();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Student Management System.");
			System.out.println("--------------------------");
			System.out.println("1.Add");
			System.out.println("2.Remove");
			System.out.println("3.Update");
			System.out.println("4.View");
			System.out.println("5.Exit");
			System.out.println("--------------------------");
			System.out.println();

			System.out.println("Enter your Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter Student name :");
				String name = sc.nextLine();
				System.out.print("Enter Course name :");
				String course = sc.nextLine();
				sm.addStudent(name, course);
				break;
			case 2:
				System.out.print("Enter Id which you want to remove :");
				int id = sc.nextInt();
				sm.remove(id);
				break;
			case 3:
				System.out.print("Enter Id which you want to update :");
				id = sc.nextInt();
				System.out.print("Enter name which you want to update :");
				name = sc.nextLine();
				System.out.print("Enter Id which you want to update :");
				course = sc.nextLine();
				sm.update(id, name, course);
				System.out.println();
				break;
			case 4:
				sm.view();
				System.out.println();
				break;
			case 5:
				System.exit(0);

			default:
				System.out.println("Invalid choice!!!");
				System.out.println();
			}

		}

	}

}
