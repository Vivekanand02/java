package libraryManagement;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<Book> borrowedBooks = new ArrayList<>();

	public User(String name) {
		this.name = name;
	}

	public void borrowBook(Book book) {
		if (book.getIsAvailable()) {
			book.issueBook();
			borrowedBooks.add(book);
			System.out.println(name + " borrowed " + book.getTitle());
		} else {
			System.out.println("Sorry, " + book.getTitle() + "is Already issued");

		}
	}

	public void returnBook(Book book) {
		if (borrowedBooks.contains(book)) {
			borrowedBooks.remove(book);
			System.out.println(name + " returned " + book.getTitle());
		} else {
			System.out.println("You didn't borrow this book.");
		}
	}

	public void displayBorrowedBooks() {
		if (borrowedBooks.isEmpty()) {
			System.out.println(name + " has no borrowed books.");
			return;
		}
		System.out.println(name + " borrowed: " + borrowedBooks);
	}
}
