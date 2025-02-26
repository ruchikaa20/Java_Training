package MovieTicketBooking;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseTables {
	
	public static void createTables() {
		Connection conn = DatabaseConnection.getConnection();
		if(conn == null) {
			System.out.println("Database connection failed");
			return;
		}
		try {
			Statement smt = conn.createStatement();
			
			String createMoviesTable = "Create Table if not exists Movies (" 
										+ "movie_id INT Auto_increment Primary Key,"
										+ "title varchar(60) not null,"
										+ "genre varchar(20),"
										+ "duration int not null)";
			smt.executeUpdate(createMoviesTable);
			System.out.println("Movies table created ");
			
			//shows
			
			String createShowsTable = "Create Table if not exists Shows ("
									   + "show_id INT Auto_increment Primary Key,"
									   + "movie_id INT,"
									   + "show_time DATETIME not null,"
									   + "available_seats INT not null,"
									   + "Foreign Key (movie_id) References Movies(movie_id))";
			smt.executeUpdate(createShowsTable);
			System.out.println("Shows table created ");
			
			
			String createBookingsTable = "Create Table if not exists Bookings ("
					   + "booking_id INT Auto_increment Primary Key,"
					   + "user_name varchar(30) not null,"
					   + "show_id INT,"
					   + "seats_booked INT not null,"
					   + "booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,"
					   + "Foreign Key (show_id) References Shows(show_id))";
			smt.executeUpdate(createBookingsTable);
			System.out.println("Bookings table created ");
			
			
			smt.close();
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		createTables();
	}

}
