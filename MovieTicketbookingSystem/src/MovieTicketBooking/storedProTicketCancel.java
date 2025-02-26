package MovieTicketBooking;

import java.sql.Connection;
import java.sql.SQLException;

public class storedProTicketCancel {
	
	public class storedProForMultiple {
		
		public static void StoredProcedure() throws SQLException {
			Connection conn = DatabaseConnection.getConnection();
			if(conn==null) {
				System.out.println("Database Connection Failed");
				return;
			}
			
		}	
	}
}
