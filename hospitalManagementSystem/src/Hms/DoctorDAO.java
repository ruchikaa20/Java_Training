package Hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {
	
	public void addDoctor(Doctor doctor) throws SQLException {
		String query = "Insert into Doctor (Name, Speciality, Contact_no) Values (?,?,?)";
		try (Connection conn = DatabaseConnection.getConnection();
			 PreparedStatement psmt = conn.prepareStatement(query)){
				
				 psmt.setString(1,doctor.getName());
				 psmt.setString(2,doctor.getSpeciality());
				 psmt.setString(3,doctor.getContact_no());
				 psmt.executeUpdate();
		}
	}
	
	public List<Doctor> getAllDoctors() throws SQLException {
        List<Doctor> doctors = new ArrayList<>();
        String query = "SELECT * FROM Doctor";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
 
            while (rs.next()) {
                Doctor doctor = new Doctor(
                       rs.getInt("Doctor_Id"),
                       rs.getString("Name"),
                       rs.getString("Speciality"),
                       rs.getString("Contact_no")
                );
                doctors.add(doctor);
            }
        }
        return doctors;
    }
 
    public void updateDoctor(Doctor doctor) throws SQLException {
        String query = "UPDATE Doctor SET name = ?, speciality = ?, Contact_no = ? WHERE Doctor_Id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setString(1, doctor.getName());
            psmt.setString(2, doctor.getSpeciality());
            psmt.setString(3, doctor.getContact_no());
            psmt.setInt(4, doctor.getDoctor_Id());
 
            psmt.executeUpdate();
        }
    }
 
    public void deleteDoctor(int id) throws SQLException {
        String query = "DELETE FROM Doctor WHERE Doctor_Id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, id);
            psmt.executeUpdate();
        }
    }

}
