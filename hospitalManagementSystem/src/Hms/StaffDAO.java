package Hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StaffDAO {
	
	public void addStaff(Staff staff) throws SQLException {
		String query = "Insert into Staff (Name, Role, Contact_no) Values (?,?,?)";
		try (Connection conn = DatabaseConnection.getConnection();
			 PreparedStatement psmt = conn.prepareStatement(query)){
				
				 psmt.setString(1,staff.getName());
				 psmt.setString(2,staff.getRole());
				 psmt.setString(3,staff.getContact_no());
				 psmt.executeUpdate();
		}
	}
	
	public List<Staff> getAllStaff() throws SQLException {
        List<Staff> staffs = new ArrayList<>();
        String query = "SELECT * FROM Staff";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
 
            while (rs.next()) {
            	Staff staff = new Staff(
                       rs.getInt("Doctor_Id"),
                       rs.getString("Name"),
                       rs.getString("Speciality"),
                       rs.getString("Contact_no")
                );
                staffs.add(staff);
            }
        }
        return staffs;
    }
 
    public void updateStaff(Staff staff) throws SQLException {
        String query = "UPDATE Staff SET Name = ?, Role = ?, Contact_no = ? WHERE Staff_Id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setString(1, staff.getName());
            psmt.setString(2, staff.getRole());
            psmt.setString(3, staff.getContact_no());
 
            psmt.executeUpdate();
        }
    }
 
    public void deleteStaff(int id) throws SQLException {
        String query = "DELETE FROM Staff WHERE Staff_Id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, id);
            psmt.executeUpdate();
        }
    }


}
