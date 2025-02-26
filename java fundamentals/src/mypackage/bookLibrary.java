package mypackage;

public class bookLibrary {
	
	private String bookName;
	private String bookAuthor;
	private String genre;
	private double price;
	private int bookStockCount;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookStockCount() {
		return bookStockCount;
	}
	public void setBookStockCount(int bookStockCount) {
		this.bookStockCount = bookStockCount;
	}
	
	public bookLibrary() {
		
	}
	
	public bookLibrary(String bookName, String bookAuthor, String genre, double price, int bookStockCount) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.genre = genre;
		this.price = price;
		this.bookStockCount = bookStockCount;
	}
	
	public void issueBook() {
		
	}
	
	
}
