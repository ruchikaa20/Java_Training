package MovieTicketBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CancellationTicket {
	
	public static void cancelTicket() throws SQLException{
		Connection conn = DatabaseConnection.getConnection();
		if(conn==null) {
			System.out.println("Database Connection Failed");
			return;
		}
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine(); 
        System.out.print("Enter show ID: ");
        int showID = scanner.nextInt();
        scanner.nextLine(); 
        String query = "SELECT booking_id FROM Bookings WHERE user_name = ? AND show_id = ?"; 
        try(PreparedStatement pstmt = conn.prepareStatement(query)){
        	pstmt.setString(1, username);
        	pstmt.setInt(2, showID);
        	ResultSet rs = pstmt.executeQuery();
        	if(rs.next()) {
        		int bookingid = rs.getInt("booking_id");
        		
        			String cancelledQuery = "DELETE from Bookings WHERE booking_id = ?";
        			try(PreparedStatement cancelstmt = conn.prepareStatement(cancelledQuery)){
        				cancelstmt.setInt(1, bookingid);
        				cancelstmt.executeUpdate();
        				
        			}
        			 System.out.println("Booking cancelled successfully");
        	}
        	else {
        		System.out.print("No booking found this user");
        	}
	    }
        catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
