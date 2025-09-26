package chatApplication;

import java.util.Scanner;

public class Implementations {
	Scanner scanner = new Scanner(System.in);
	String name, password;
	int mobile;

	public void registerUser() {
		while (true) {
			System.out.print("Enter your name :");
			if (scanner.hasNextLine()) {
				name = scanner.nextLine();
				break;
			} else {
				System.out.println("Invalid input ! Please enter String value...");
				scanner.next();

			}
			System.out.print("Make your password :");
			if (scanner.hasNextLine()) {
				password = scanner.nextLine();
				break;
			} else {
				System.out.println("Invalid input ! Please enter String value...");
				scanner.next();
			}
			System.out.print("Enter a mobile number :");
			if (scanner.hasNextInt()) {
				mobile = scanner.nextInt();
				break;
			} else {
				System.out.println("Invalid input ! Please enter Int value...");
				scanner.next();
			}

		}
	}
}
