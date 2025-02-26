package MovieTicketBooking;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DatabaseConnection.getConnection();
		if(conn == null) {
			System.out.println("Database Connection Failed");
			return;
		}
		try {
			//create jdbc row set
			JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
			
			rowSet.setUrl("jdbc:mysql://localhost:3306/movie_booking");
			rowSet.setUsername("root");
			rowSet.setPassword("Genpact@123456789");
			
			rowSet.setCommand("select * from Movies");
			rowSet.execute();		
			
			while(rowSet.next()) {
				System.out.println("Id : "+rowSet.getInt("movie_id"));
			}
			
			while(rowSet.previous()) {
				System.out.println("Id : "+rowSet.getInt("movie_id"));
			}
			
			rowSet.close();
			
			System.out.println("---------------------------");
			
			//cached row set
			CachedRowSet ct = RowSetProvider.newFactory().createCachedRowSet();
			ct.setCommand("select * from movies");
			ct.execute(conn);
			
			while(ct.next()) {
				if(ct.getInt("movie_id") == 3) {
					ct.updateString("title", "Jab we met");
					ct.updateRow();
				}
			}
			
			conn = DatabaseConnection.getConnection();
			conn.setAutoCommit(false);
			ct.acceptChanges(conn);
			conn.close();
			
			while(ct.next()) {
				System.out.println("Id : "+ct.getInt("movie_id"));
				System.out.println("Title : "+ct.getString("title"));
			}
			
			ct.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}
