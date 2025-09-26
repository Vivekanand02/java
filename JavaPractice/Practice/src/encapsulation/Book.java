package encapsulation;

public class Book {

	private String title;
	private String author;
	private Double price;
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setPrice(Double price) {
		this.price=price;
	}
	public void applyDiscount(Double price) {
		Double discount=price*25/100;
		Double originalPrice=price-discount;
		System.out.println(originalPrice);
	}
	public Double getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	class Run{
		public static void main(String[] args) {
			Book book=new Book();
			book.setTitle("Let us C");
			book.setAuthor("Yashwant Kanetkar");
			book.setPrice(300.25);
			System.out.println(book.getTitle());
			System.out.println(book.getAuthor());
			System.out.println(book.getPrice());
			book.applyDiscount(book.getPrice());
		}
	}
}
