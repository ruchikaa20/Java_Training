package Hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PatientDAO {
	
	public void addPatient(Patient patient) throws SQLException {

	    		String query = "Insert into Patient (First_Name, Last_Name, Age, Gender, Contact_no) Values (?,?,?,?,?)";
		try (Connection conn = DatabaseConnection.getConnection();
			 PreparedStatement psmt = conn.prepareStatement(query)){
				
				 psmt.setString(1,patient.getFirst_name());
				 psmt.setString(2,patient.getLast_name());
				 psmt.setInt(3,patient.getAge());
				 psmt.setString(4,patient.getGender());
				 psmt.setString(5,patient.getContact_no());	 
				 psmt.executeUpdate();
		}
	

	}
	
	public List<Patient> getAllPatients() throws SQLException{
		List<Patient> patients = new ArrayList<>();
		String query = "select * from Patient";
		try (Connection conn = DatabaseConnection.getConnection();
				 Statement smt = conn.createStatement();
				 ResultSet rs = smt.executeQuery(query)){
					while(rs.next()) {
						Patient patient = new Patient(
								rs.getInt("Patient_id"),
								rs.getString("First_name"),
								rs.getString("Last_name"),
								rs.getInt("Age"),
								rs.getString("Gender"),
								rs.getString("Contact_no")
								);
						patients.add(patient);
					}
					
					return patients;
		}
	}
	
	public void deletePatient(int id) throws SQLException {
        String query = "DELETE FROM Patient WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setInt(1, id);
            psmt.executeUpdate();
        }
    }
	
	public void updatePatient(Patient patient) throws SQLException {
        String query = "UPDATE Patient SET First_Name = ?, Last_Name = ?, Age = ?, Gender = ?, Contact_no = ? WHERE Patient_Id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
            psmt.setString(1, patient.getFirst_name());
            psmt.setString(2, patient.getLast_name());
            psmt.setInt(3, patient.getAge());
            psmt.setString(4, patient.getGender());
            psmt.setString(5, patient.getContact_no());
            psmt.setInt(6, patient.getPatient_Id());
            psmt.executeUpdate();
        }
    }
	
	
}
