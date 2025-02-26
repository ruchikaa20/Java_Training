package OOPconcepts;

public class book {
	private String title;
	private String authorName;
	private String genre;
	private double price;
	private int bookStocks;
	
	//constructor
	 public book() {
			// TODO Auto-generated constructor stub
	}
	 
    public book( String titl, String autname, String gen, double price) {
		this.authorName = autname;
		this.title = titl;
		this.genre = gen;
		this.price = price;
		this.bookStocks = bookStocks;
	} 
    

	//getter setter
	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getgenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}
	
	public void setbookStocks(int bookStocks) {
		this.bookStocks = bookStocks;
	}

	public double getbookStocks() {
		return bookStocks;
	}

	
    public void displayBook() {
        	System.out.println("Book Name : "+ title);
        	System.out.println("Book Author name : "+ authorName);
        	System.out.println("Book genre : "+ genre);
        	System.out.println("Book Price : "+ price);
        	System.out.println("Book book stock : "+ bookStocks);
        	System.out.println("---------------------------------------");
    }
 
}
