package MovieTicketBooking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.RowSetProvider;

public class FilterApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Connection conn = DatabaseConnection.getConnection();
				Statement smt = conn.createStatement();
				ResultSet rs = smt.executeQuery("Select * from Shows")){
			
				FilteredRowSet frs = RowSetProvider.newFactory().createFilteredRowSet();
				frs.populate(rs);
				
				frs.setFilter(new availableShowSeatsFilter(60));
				
				while(frs.next()) {
					int showid = frs.getInt("show_id"); 
	        		int movieid = frs.getInt("movie_id");
	        		int aseats = frs.getInt("available_seats");
					String showTime = frs.getString("show_time");
					
	        		System.out.println("Show ID : "+showid);
	        		System.out.println("Movie ID :"+movieid);
	    			System.out.println("Available seats :"+aseats);
	    			System.out.println("Show Time :"+showTime);
					System.out.println("---------");
				}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
