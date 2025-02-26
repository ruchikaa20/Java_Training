package MovieTicketBooking;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

public class ShowAvailableMovies {
	
	public static void  displayMovies() {
	
		Connection conn = DatabaseConnection.getConnection();
		if(conn == null) {
			System.out.println("database connection failed");
			return;
		}
	
		String query = "select movies.* ,Shows.show_id, Shows.show_time, Shows.available_seats from Movies join Shows on Movies.movie_id = Shows.show_id";
		
		try(Statement smt = conn.createStatement()){
			ResultSet rs = smt.executeQuery(query);
			while(rs.next()) {
				int movieId = rs.getInt("movie_id");
				String title = rs.getString("title");
				String genre = rs.getString("genre");
				int duration = rs.getInt("duration");
				int showId = rs.getInt("show_id");
				Timestamp showTime = rs.getTimestamp("show_time");
				int availableSeats = rs.getInt("available_seats");
		        System.out.println("Movie ID: "+movieId);
		        System.out.println(" Movie Title :"+title);
		        System.out.println(" Movie genre :"+genre);
		        System.out.println(" Movie Duration : "+duration);
		        System.out.println(" Show ID : "+showId);
		        System.out.println(" Show Time : "+showTime);
		        System.out.println(" Available seats :"+availableSeats);
				System.out.println(" ");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		displayMovies();
	}
	
}
