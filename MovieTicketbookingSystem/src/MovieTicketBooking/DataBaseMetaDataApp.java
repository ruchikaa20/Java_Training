package MovieTicketBooking;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseMetaDataApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection conn = DatabaseConnection.getConnection()){
				
			DatabaseMetaData dbMd =  conn.getMetaData();
			
			System.out.println("Database Product name : "+dbMd.getDatabaseProductName());
			System.out.println("Database Product Version : "+dbMd.getDatabaseProductVersion());
			System.out.println("JDBC Driver name : "+dbMd.getDriverName());
			System.out.println("JDBC Driver version : "+dbMd.getDriverVersion());
		    System.out.println("Db URL : "+dbMd.getURL());
		    System.out.println("Db Username : "+dbMd.getUserName());
		    
		    ResultSet rs = dbMd.getTables("movie_booking", null, "%", new String[] {"TABLE"});
		    while(rs.next()) {
		    	System.out.println(rs.getString("TABLE_NAME"));
		    }
		    ResultSet rs1 = dbMd.getColumns(null, null, "Movies", "%");
		    while(rs1.next()) {
		    	System.out.println(rs1.getString("COLUMN_NAME"));
		    	System.out.println(rs1.getString("TYPE_NAME"));
		    	
		    	System.out.println("-----------------");
		    	
		    }
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
