//package OOPconcepts;
//import java.util.Scanner;
//
//public class bookApplication {
//	
//	private static bookmanagement[] books;  //created an array
//	
//	private static int totalBooks = 0;
//	private static int maxBooks = 5;
//	
//	Scanner sc = new Scanner(System.in);
//	public static void createAccount(Scanner sc) {
//		
//		System.out.println("Enter your name: ");
//		String name = sc.nextLine();
//		
//		System.out.println("Enter as manager or user: ");
//		String accType = sc.nextLine();
//		
//		if(accType.equalsIgnoreCase("manager")) {
//			System.out.println("Press 1: Display all Books");
//			System.out.println("Press 2: Add Book");
//			System.out.println("Press 3: Delete Book");
//			System.out.println("Press 4: Update book Stocks");
//			
//			int choice = sc.nextInt();
//			sc.nextLine();
//			
//			switch(choice) {
//			case 1:
//				books.displayBooksList();
//				break;
//			case 2:
//				books.addBooks();
//				break;
//			case 3:
//				books.removeBooks();
//				break;
//			case 4:
//				books.updateBookstock();
//				break;
//			}
//		}
//		
//		else if(accType.equalsIgnoreCase("user")) {
//			System.out.println("Press 1: Display all Books");
//			System.out.println("Press 2: Issue Book");
//			System.out.println("Press 3: Return Book");
//		}
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner sc = new Scanner(System.in);
//		books = new bookmanagement[50];
//		
//		while(true) {
//			System.out.println("Book Application menu");
//			System.out.println("Press 1: To create an account");
//			System.out.println("Press 2: Display all Books");
//			System.out.println("Press 5: Issue Book");
//			System.out.println("Press 6: Return Book");
//			System.out.println("Press 7: Update book Stocks");
//			System.out.println("Press 8: Exist");
//			
//			int choice = sc.nextInt();
//			sc.nextLine();
//			
//			switch(choice) {
//			case 1:
//				createAccount(sc);
//				break;
//			case 2:
//				displayAllAccount();
//				break;
//			case 3:
//				depositMoney(sc);
//				break;
//			case 4:
//				withdrawMoney(sc);
//				break;
//			case 5:
//				transferMoney(sc);
//				break;
//			case 6:
//				buyStocks(sc);
//				break;
//			case 7:
//				sellStocks(sc);
//				break;
//			case 8:
//				System.out.println("Thank You !! Exiting from the system");
//				break;
//			default :
//				System.out.println("Invalid choice, Enter from 1-6");
//				sc.close();
//			}
//		}
//
//
//	}
//
//}
