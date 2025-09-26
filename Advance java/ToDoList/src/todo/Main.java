package todo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ListManager todoList = new ListManager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nTo-Do List Manager");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Remove Task");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				System.out.print("Enter task description: ");
				String description = scanner.nextLine();
				todoList.addTask(description);
				break;
			case 2:
				todoList.viewTasks();
				break;
			case 3:
				System.out.print("Enter task ID to mark as completed: ");
				int completeId = scanner.nextInt();
				todoList.markTaskAsCompleted(completeId);
				break;
			case 4:
				System.out.print("Enter task ID to remove: ");
				int removeId = scanner.nextInt();
				todoList.removeTask(removeId);
				break;
			case 5:
				System.out.println("Exiting...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice! Please try again.");
			}
		}
	}
}
