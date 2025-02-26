package OOPconcepts;

import java.util.Scanner;

public class bookinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 System.out.println("Book management system");
//	        System.out.println("1. Add book");
//	        System.out.println("2. Remove book");
//	        System.out.println("3. Display book list");
//	        System.out.println("4. Update book price");
//	        System.out.println("5. Exist Library");
//		bookmanagement book1 = new bookmanagement("revolution 2020", "Chetan bhagat", "Fiction politics", 500);
//		bookmanagement book2 = new bookmanagement("The art of living", "Dushant das", "Classic", 500);
//		bookmanagement book3 = new bookmanagement("Rich dad Poor dad", "Robert P", "Finance", 799);
//		bookmanagement book4 = new bookmanagement("The Shining", "Stephen King", "Horror", 999);
//		bookmanagement book5 = new bookmanagement("Charlin chapin", "harry fintos", "Comedy", 1050);
//		bookmanagement book6 = new bookmanagement("The girl in room no 105", "Chetan bhagat", "Crime", 750);
//		
		bookmanagement manager = new bookmanagement(5);
		
        
        Scanner sc = new Scanner(System.in);
       
       
        System.out.println("Enter no of books to enter: ");
		int numBook = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<numBook; i++) {
			System.out.println("Enter book name: ");
			String name = sc.nextLine();
	
			System.out.println("Enter book author name: ");
			String athname = sc.nextLine();
			
			System.out.println("Enter book genre: ");
			String genre = sc.nextLine();
			
			System.out.println("Enter book price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			manager.addBook(new bookLibrary(name, athname, genre, price));
			
		}
		
		manager.displayBooksList();
		
		
		
		System.out.println("Enter book name to check its availability: ");
		String bookn = sc.nextLine();
		manager.checkAvailable(bookn);
			
		System.out.println("Enter book name to issue: ");
		String bookTitle = sc.nextLine();
		manager.issueBook(bookTitle);
				
		System.out.println("Enter book name to return: ");
		String n = sc.nextLine();
		manager.removeBook(n);
		
		manager.displayBooksList();
		
		sc.close();	
			
			
		
		
	
	}

}
