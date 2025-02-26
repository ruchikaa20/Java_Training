//package mypackage;
//
//import java.util.Scanner;
//
//import OOPconcepts.bankAccount;
//
//public class bookManagementApplication {
//	
//	private static bookLibrary[] books;  //created an array
//	
//	private static int totalBooks = 0;
//	private static int maxBooks = 500;
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner sc = new Scanner(System.in);
//		books = new bookLibrary[5];
//		
//		while(true) {
//			System.out.println("Book Application menu");
//			System.out.println("Press 1: Add Book");
//			System.out.println("Press 2: Remove a Book");
//			System.out.println("Press 3: Search Book");
//			System.out.println("Press 4: Display Book details");
//			System.out.println("Press 5: Issue book");
//			System.out.println("Press 6: Submit book");
//			System.out.println("Press 7: Update book stocks");
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
//	}
//
//}
