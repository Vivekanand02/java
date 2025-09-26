package libraryManagement;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		User user = new User("Alice");
		Scanner sc = new Scanner(System.in);
		library.addBook(new Book("A", "B", "12"));
		library.addBook(new Book("C", "D", "13"));
		while (true) {
			System.out.println("\nLibrary Management System");
			System.out.println("1. Display Books");
			System.out.println("2. Search Book");
			System.out.println("3. Borrow Book");
			System.out.println("4. Return Book");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				library.displayBooks();
				break;
			case 2:
				System.out.println("Enter the book titile to search : ");
				String title = sc.nextLine();
				Book book = library.searchBook(title);
				if (book != null)
					System.out.println("Found :" + book);
				else
					System.out.println("Book not found.");
				break;
			case 3:
				System.out.print("Enter the title to borrow : ");
				String borrowTitle = sc.nextLine();
				Book bookToBorrow = library.searchBook(borrowTitle);
				if (bookToBorrow != null)
					user.borrowBook(bookToBorrow);
				else
					System.out.println("Book not available.");
				break;
			case 4:
				System.out.print("Enter book title to return: ");
				String returnTitle = sc.nextLine();
				Book bookToReturn = library.searchBook(returnTitle);
				if (bookToReturn != null)
					user.returnBook(bookToReturn);
				else
					System.out.println("Invalid book.");
				break;
			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
