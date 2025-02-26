package Hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {
	
	private boolean isPatientRegistered(int patientID) throws SQLException {
		String query = "SELECT * from Patient where patient_Id = ? ";
		try(Connection conn = DatabaseConnection.getConnection();
			 PreparedStatement psmt = conn.prepareStatement(query)){
			psmt.setInt(1, patientID);
			ResultSet rs = psmt.executeQuery();
			if(rs.next() && rs.getInt(1)>0) {
				return true;
			}
		}
		
		return false;
	}
	
	
	private boolean isDoctorRegistered(int doctorID) throws SQLException {
		String query = "SELECT * from Doctor where Doctor_Id = ? ";
		try(Connection conn = DatabaseConnection.getConnection();
			 PreparedStatement psmt = conn.prepareStatement(query)){
			psmt.setInt(1, doctorID);
			ResultSet rs = psmt.executeQuery();
			if(rs.next() && rs.getInt(1)>0) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public void addAppointment(Appointment appointment) throws SQLException {
		
		if(!isPatientRegistered(appointment.getPatient_Id())) {
			System.out.println("Patient not registered !!");
			return;
		}
		
		if(!isDoctorRegistered(appointment.getDoctor_Id())) {
			System.out.println("Doctor not registered !!");
			return;
		}
		
		else {
		String query = "Insert into Appointment (Patient_Id, Doctor_Id, Reason, Appointment_date) Values (?,?,?,?)";
		try (Connection conn = DatabaseConnection.getConnection();
			 PreparedStatement psmt = conn.prepareStatement(query)){
				
				 psmt.setInt(1, appointment.getPatient_Id());
				 psmt.setInt(2, appointment.getDoctor_Id());
				 psmt.setString(3, appointment.getReason());
				 psmt.setString(4, appointment.getAppointment_date());
				 psmt.executeUpdate();
		}
		}
	}
	
	public List<Appointment> getAllAppointment() throws SQLException {
        List<Appointment> appointments = new ArrayList<>();
        String query = "SELECT * FROM Appointment";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
 
            while (rs.next()) {
            	Appointment appointment = new Appointment(
            		   rs.getInt("Patient_Id"),
                       rs.getInt("Doctor_Id"),
                       rs.getString("Reason"),
                       rs.getString("Appointment_date")
                );
            	appointments.add(appointment);
            }
        }
        return appointments;
    }
	
	public void updateAppointment(Appointment appointment) throws SQLException {
        String query = "UPDATE Appointment SET Patient_Id = ?, Doctor_Id = ?, reason = ? WHERE Appointment_Id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, appointment.getPatient_Id());
            psmt.setInt(2, appointment.getDoctor_Id());
            psmt.setString(3, appointment.getReason());
 
            psmt.executeUpdate();
        }
    }
	
	public void deleteAppointment(int id) throws SQLException {
        String query = "DELETE FROM Appointment WHERE Appointment_Id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement psmt = conn.prepareStatement(query)) {
 
            psmt.setInt(1, id);
            psmt.executeUpdate();
        }
    }


}
