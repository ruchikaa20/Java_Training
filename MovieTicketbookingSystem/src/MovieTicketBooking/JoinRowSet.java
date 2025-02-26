package MovieTicketBooking;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;


public class JoinRowSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = DatabaseConnection.getConnection();
		if(conn == null) {
			System.out.println("Database Connection Failed");
			return;
		}
		try {
			CachedRowSet ct = RowSetProvider.newFactory().createCachedRowSet();
			ct.setCommand("select * from movies");
			ct.execute(conn);
			
			
			CachedRowSet ct2 = RowSetProvider.newFactory().createCachedRowSet();
			ct2.setCommand("select * from Shows");
			ct2.execute(conn);
			
			conn.close();
			
			
			javax.sql.rowset.JoinRowSet jrs = RowSetProvider.newFactory().createJoinRowSet();
			
			ct.setMatchColumn("movie_id");
			ct2.setMatchColumn("movie_id");
			
			jrs.addRowSet(ct);
			jrs.addRowSet(ct2);
			
			while(jrs.next()) {
				System.out.println("movie ID :"+jrs.getInt("movie_id")+" movie Title : "+jrs.getString("title")+" Seats available : "+jrs.getInt("available_seats"));
				
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
