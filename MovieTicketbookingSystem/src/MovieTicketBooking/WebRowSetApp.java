package MovieTicketBooking;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.WebRowSet;

public class WebRowSetApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Connection conn = DatabaseConnection.getConnection();
		try {
			
			WebRowSet wrs = RowSetProvider.newFactory().createWebRowSet();
			wrs.setCommand("select * from Movies");
			wrs.execute(conn);
			
			conn.close();
			System.out.println("Connection close");
			
			FileWriter writer = new FileWriter("movies.xml");
			wrs.writeXml(writer);
			writer.close();
			
			WebRowSet new_wrs = RowSetProvider.newFactory().createWebRowSet();
			FileReader reader = new FileReader("movies.xml");
			new_wrs.readXml(reader);
			reader.close();
			
			while(new_wrs.next()) {
				System.out.println("Id : "+new_wrs.getInt("movie_id")+" Title : "+new_wrs.getString("title"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
