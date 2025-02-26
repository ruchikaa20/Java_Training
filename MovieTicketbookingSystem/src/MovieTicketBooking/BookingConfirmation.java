package MovieTicketBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;

public class BookingConfirmation {
	
	public static void confirmTicket() throws SQLException {
		

        Connection conn = DatabaseConnection.getConnection();
		if(conn==null) {
			System.out.println("Database Connection Failed");
			return;
		}
    
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        
        String query = "select Bookings.user_name, Bookings.booking_id, Movies.title, Shows.show_time, Bookings.seats_booked from Bookings join Shows on Bookings.show_id = Shows.show_id join Movies on Shows.movie_id = Movies.movie_id where Bookings.user_name = ?";
	
        try(PreparedStatement pstmt = conn.prepareStatement(query)){
        	pstmt.setString(1, username);
        	ResultSet rs = pstmt.executeQuery();
        	if(rs.next()) {
        		int bookingid = rs.getInt("booking_id"); 
        		String title = rs.getString("title");
        		int bookedseats = rs.getInt("seats_booked");
				Timestamp showTime = rs.getTimestamp("show_time");
				System.out.println("Booking Details");
        		System.out.println("Username: "+username);
        		System.out.println("Booking ID :"+bookingid);
    			System.out.println(" Movie Title :"+title);
		        System.out.println(" Show Time : "+showTime);
		        System.out.println(" Seats Booked:"+bookedseats);
		        System.out.println("------------------------------");
        	}
        	else {
        		System.out.print("No booking found for user ");
        	}
        }
     
		catch(SQLException e) {
			e.printStackTrace();
		}
        
	}
	

}
