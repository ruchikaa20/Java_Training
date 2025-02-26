package Hms;

public class Doctor {
	private int Doctor_Id;
	private String Name;
	private String Speciality;
	private String Contact_no;
	public int getDoctor_Id() {
		return Doctor_Id;
	}
	public void setDoctor_Id(int doctor_Id) {
		Doctor_Id = doctor_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpeciality() {
		return Speciality;
	}
	public void setSpeciality(String speciality) {
		Speciality = speciality;
	}
	public String getContact_no() {
		return Contact_no;
	}
	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}
	public Doctor(int doctor_Id, String name, String speciality, String contact_no) {
		super();
		Doctor_Id = doctor_Id;
		Name = name;
		Speciality = speciality;
		Contact_no = contact_no;
	}
	@Override
	public String toString() {
		return "Doctor [Doctor_Id=" + Doctor_Id + ", Name=" + Name + ", Speciality=" + Speciality + ", Contact_no="
				+ Contact_no + "]";
	}
	public Doctor(String name, String speciality, String contact_no) {
		super();
		Name = name;
		Speciality = speciality;
		Contact_no = contact_no;
	}
	

}
