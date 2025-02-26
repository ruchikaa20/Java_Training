package Hms;

public class Appointment {
	
	private int Appointment_Id;
	private int Patient_Id;
	private int Doctor_Id;
	private String reason;
	private String appointment_date;
	public int getAppointment_Id() {
		return Appointment_Id;
	}
	public void setAppointment_Id(int appointment_Id) {
		Appointment_Id = appointment_Id;
	}
	public int getPatient_Id() {
		return Patient_Id;
	}
	public void setPatient_Id(int patient_Id) {
		Patient_Id = patient_Id;
	}
	public int getDoctor_Id() {
		return Doctor_Id;
	}
	public void setDoctor_Id(int doctor_Id) {
		Doctor_Id = doctor_Id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getAppointment_date() {
		return appointment_date;
	}
	public void setAppointment_date(String appointment_date) {
		this.appointment_date = appointment_date;
	}
	
	public Appointment(int appointment_Id, int patient_Id, int doctor_Id, String reason, String appointment_date) {
		super();
		Appointment_Id = appointment_Id;
		Patient_Id = patient_Id;
		Doctor_Id = doctor_Id;
		this.reason = reason;
		this.appointment_date = appointment_date;
	}
	
	public Appointment(int patient_Id, int doctor_Id, String reason, String appointment_date) {
		super();
		Patient_Id = patient_Id;
		Doctor_Id = doctor_Id;
		this.reason = reason;
		this.appointment_date = appointment_date;
	}
	
	
	public Appointment(int patient_Id, int doctor_Id, String reason) {
		super();
		Patient_Id = patient_Id;
		Doctor_Id = doctor_Id;
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "Appointment [Appointment_Id=" + Appointment_Id + ", Patient_Id=" + Patient_Id + ", Doctor_Id="
				+ Doctor_Id + ", reason=" + reason + ", appointment_date=" + appointment_date + "]";
	}
	
	

}
