package MovieTicketBooking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class registration {
	
    public static void registerUser() throws SQLException {
    	Connection conn = DatabaseConnection.getConnection();
		if(conn==null) {
			System.out.println("Database Connection Failed");
			return;
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter phone no: ");
        String phone = scanner.nextLine();
        
        System.out.print("Register as user/admin: ");
        String role = scanner.nextLine();
        
        if(!role.equalsIgnoreCase("admin") && !role.equalsIgnoreCase("user")) {
        	System.out.print("Invalid role !! Please enter admin or role ");
        }
        
        String query = "INSERT into Users (Name, Password, Email, Phone, Role) "
        		       + "VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement psmt = conn.prepareStatement(query)){
			psmt.setString(1, name);
			psmt.setString(2, pwd);
			psmt.setString(3, email);
			psmt.setString(4, phone);
			psmt.setString(5, role);
			psmt.executeUpdate();
        
			System.out.println("Registration successfull !!");
			 scanner.close();
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}   
    } 
    
    public static String loginUser() {
    	
    	Connection conn = DatabaseConnection.getConnection();
		if(conn==null) {
			System.out.println("Database Connection Failed");
			return null;
		}	
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String pwd = scanner.nextLine();
        
    	String query = "SELECT Role FROM Users WHERE Name = ? AND Password = ?;";
    	
    	try (PreparedStatement psmt = conn.prepareStatement(query)){
			psmt.setString(1, name);
			psmt.setString(2, pwd);
			
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				return rs.getString("Role");
			}
			
        }
    	catch (SQLException e) {
			e.printStackTrace();
		}  
    	return null;
    }
}






