package OOPconcepts;

public class bookmanagement {
	
    private bookLibrary[] books;
    int count;
	
    public bookmanagement(int size) {
    	books = new bookLibrary[size];
    	count = 0;
    }
    
	public void addBook(bookLibrary book) {
		if(count < books.length) {
			books[count] = book;
			count++;
			System.out.println("Book added succesfully ");
		}
		else {
			System.out.println("Library is full, cannot add more books");
		}
	}
	
	public void removeBook(String title) {
		for(int i=0; i<count; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				for(int j=i; j<count-1; j++) {
					books[j] = books[j+1];
				}
				books[count - 1]=null;
				count--;
				System.out.println("Book removed succesfully ");
				return;
			}
		}
		System.out.println("Book not found ");
	}
	
	public void searchBook(String title) {
		for(int i=0; i<count; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				System.out.println("Book Found");
				books[i].displayBook();
				return;
			}
		}
		System.out.println("Book not found ");
	}
   
	public void displayBooksList () {
		if(count == 0) {
			System.out.println("No book Available");
			return;
		}
		else {
			System.out.println("Book List");
			for(int i=0; i<count; i++) {
				books[i].displayBook();
			}
		}
	}
	
	public void issueBook(String title) {
		for(int i=0; i<count; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				books[i].issueBook();
				System.out.println("Book issued successfully ");
				return;
			}
		}
		System.out.println("Book not found ");
	}
	
	public void submitBook(String title) {
		for(int i=0; i<count; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				books[i].submitBook();
				System.out.println("Book returned successfully ");
				return;
			}
		}
		System.out.println("Book not found ");
	}
	
	public void checkAvailable(String title) {
		for(int i=0; i<count; i++) {
			if(books[i].getTitle().equalsIgnoreCase(title)) {
				if(books[i].isAvailable());
				System.out.println("Book is available ");
				return;
			}
			
			System.out.println("");
		}
		
	}
	


}
