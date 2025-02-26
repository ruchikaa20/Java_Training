package MovieTicketBooking;
import java.sql.SQLException;
import java.util.Scanner;

public class MovieTicketBookingApp {
	
	public static void adminMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Movie Ticket Booking Application menu");
			System.out.println("Press 1: Add Movies");
			System.out.println("Press 2: Add Shows");
			System.out.println("Press 3: Show Available Movies");
			System.out.println("Press 4: exit the application");
			int choice = sc.nextInt();
			sc.nextLine();	
			switch(choice) {
			case 1:
				InsertData.insertMovies();
				break;
			case 2:
				InsertData.insertShows();
				break;
			case 3:
				ShowAvailableMovies.displayMovies();
				break;
			case 4:
				System.out.println("Thank You !! Exiting from the system");
				break;
			default :
				System.out.println("Invalid choice, Enter from 1-4");
				sc.close();
			}
		}
	}
	
	public static void userMenu() throws SQLException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Movie Ticket Booking Application menu");
			System.out.println("Press 1: Show Available Movies");
			System.out.println("Press 2: Book Ticket");
			System.out.println("Press 3: Confirm Ticket");
			System.out.println("Press 4: Cancel Ticket");
			System.out.println("Press 5: exit the application");
			int choice = sc.nextInt();
			sc.nextLine();	
			switch(choice) {
			case 1:
				ShowAvailableMovies.displayMovies();
				break;
			case 2:
				BookTicket.bookTicket();
				break;
			case 3:
				BookingConfirmation.confirmTicket();
				break;
			case 4:
				CancellationTicket.cancelTicket();
				break;
			case 5:
				System.out.println("Thank You !! Exiting from the system");
				break;
			default :
				System.out.println("Invalid choice, Enter from 1-4");
				sc.close();
			}
		}
	}
	

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Movie Ticket Booking Application menu");
		System.out.println("1. Register ");
		System.out.println("2. Login ");
		System.out.println("Choose an option: ");
		int opt = sc.nextInt();
		if(opt == 1) {
			registration.registerUser();
		}
		else if(opt == 2 ) {
			String role = registration.loginUser();
			if(role != null) {
				System.out.println("Login successfull !! Logged in as "+role.toUpperCase());
				switch(role.toLowerCase()) {
				case "admin" :
					adminMenu();
					break;
				case "user"  :
					userMenu();
					break;
			    default:
			    	System.out.println("Unknown role...");
				}
			}
			else {
				System.out.println("Invalid user or password");
			}
		}
	
	}

}
