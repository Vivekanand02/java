package libraryManagement;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isAvailable;

	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void issueBook() {
		isAvailable = false;
	}

	public void returnBook() {
		isAvailable = true;
	}

	@Override
	public String toString() {
		return title + " by " + author + "(ISBN : " + isbn + ") - " + (isAvailable ? "Available" : "Issued");
	}
}
