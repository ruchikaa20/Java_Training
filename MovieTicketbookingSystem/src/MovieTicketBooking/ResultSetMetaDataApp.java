package MovieTicketBooking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetMetaDataApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Connection conn = DatabaseConnection.getConnection();
				Statement smt = conn.createStatement();
				ResultSet rs = smt.executeQuery("Select * from Shows")){
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCount = rsmd.getColumnCount();
			System.out.println(colCount);
			
			for(int i=1; i<=colCount; i++) {
				System.out.println("Column : "+ i);
				System.out.println("Column Name : "+ rsmd.getColumnName(i));
				System.out.println("Column Label : "+ rsmd.getColumnLabel(i));
				System.out.println("Column type : "+ rsmd.getColumnType(i));
				System.out.println("Column type class"+ rsmd.getColumnTypeName(i));
				System.out.println("Column Display size : "+rsmd.getColumnDisplaySize(i));
				System.out.println("Column Table name: "+rsmd.getTableName(i));
				System.out.println("Column Catlog name: "+rsmd.getCatalogName(i));
				System.out.println("----------------------");
			}
			
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
