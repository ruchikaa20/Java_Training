package OOPconcepts;

public class bookLibrary extends book{
	private boolean isIssued;
	
	public bookLibrary(String title, String authorName, String genre, double price) {
		super(title, authorName, genre, price);
		this.isIssued = false;
	}
	
	public void issueBook() {
		if(!isIssued) {
			isIssued = true;
			System.out.println("Book issued: "+ getTitle());
		}
		else {
			System.out.println("Book is already issued: "+ getTitle());
		}
	}
	
	public void submitBook() {
		if(!isIssued) {
			isIssued = false;
			System.out.println("Book submitted: "+ getTitle());
		}
		else {
			System.out.println("Book was not issued: "+ getTitle());
		}
	}
	
	public boolean isAvailable() {
		return isIssued;
	}
	
	public void changePrice(double newPrice) {
		this.setPrice(newPrice);
		System.out.println("Price of book is been updated");
	}
	
	public void display() {
		System.out.println("Book Details : ");
    	System.out.println("Book Name : "+ getTitle());
    	System.out.println("Book Author name : "+ getAuthorName());
    	System.out.println("Book genre : "+ getgenre());
    	System.out.println("Book Price : "+ getPrice());
    	System.out.println("Book Issued : "+ isIssued);
	}

}
