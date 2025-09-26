package epms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Admin admin = new Admin();

//		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("|---------------------------|");
			System.out.println("|Employee Payroll System    |");
			System.out.println("|---------------------------|");
			System.out.println("|1.Register an employee.    |");
			System.out.println("|2.Update an employee.      |");
			System.out.println("|3.Remove an employee.      |");
			System.out.println("|4.View an employee details.|");
			System.out.println("|5.Exit.");
			System.out.println("|---------------------------|");
			System.out.println();
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter ID of employee :");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name of employee :");
				String name = sc.nextLine();

				System.out.print("Enter role of employee :");
				String role = sc.nextLine();

				System.out.print("Enter Salary of employee :");
				double salary = sc.nextDouble();
				sc.nextLine();
				System.out.print("Enter type of employee :");
				String employementType = sc.nextLine();

				Admin.addEmployee(id, name, role, salary, employementType);
				break;
			case 2:
				System.out.println("Enter ID for updating employee :");
				id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name of employee :");
				name = sc.nextLine();
				Admin.updateEmployee(id, name);
				break;
			case 3:
				System.out.print("Enter ID of employee which you want to remove :");
				id = sc.nextInt();
				sc.nextLine();
				Admin.removeEmployee(id);
				break;
			case 4:
				System.out.println("Enter the Employee ID :");
				id = sc.nextInt();
				sc.nextLine();
				Admin.viewEmployee(id);
				break;
			case 5:
				System.exit(0);
			}
		}

	}

}
