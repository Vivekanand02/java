
package libraryManagement;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books = new ArrayList<>();

	public void addBook(Book book) {
		books.add(book);
	}

	public void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in the library.");
			return;
		}
		for (Book book : books) {
			System.out.println(book);
		}
	}

	public Book searchBook(String title) {
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				return book;
			}
		}
		return null;
	}
}
