package MovieTicketBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InsertData {
	
	public static void insertMovies() {
		
		Connection conn = DatabaseConnection.getConnection();
		if(conn == null) {
			System.out.println("database connection failed");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Movie Title: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter genre: ");
        String gen = scanner.nextLine();
        
        System.out.print("Enter duration: ");
        String dur = scanner.nextLine();
        
		String insertMovieSQL = "Insert into Movies (title, genre, duration) Values (?,?,?)";
		
		
		try (PreparedStatement psmt = conn.prepareStatement(insertMovieSQL)){
			psmt.setString(1, name);
			psmt.setString(2, gen);
			psmt.setString(3, dur);
			psmt.executeUpdate();
			
			System.out.println("Movied data inserted successfully");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertShows() {
		Connection conn = DatabaseConnection.getConnection();
		if(conn == null) {
			System.out.println("database connection failed");
			return;
		}
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Movie ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter show date and time(YYYY-MM-DD HH:mm) : ");
        String time = scanner.nextLine();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:mm");
        LocalDateTime showDateTime = LocalDateTime.parse(time, formatter);
        
        System.out.print("Enter available seats: ");
        int seats = scanner.nextInt();
        scanner.nextLine();
        
		String insertShowsSQL = "Insert into shows (movie_id, show_time, available_seats) Values (?,?,?)";
		
		try (PreparedStatement psmt = conn.prepareStatement(insertShowsSQL)) {
			psmt.setInt(1, id);
			psmt.setString(2, time);
			psmt.setInt(3, seats);
			psmt.executeUpdate();
			
			
			System.out.println("Shows data inserted successfully");
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
