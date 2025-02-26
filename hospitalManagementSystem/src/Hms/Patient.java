package Hms;

public class Patient {
	private int Patient_Id;
	private String First_name;
	private String Last_name;
	private int age;
	private String gender;
	private String Contact_no;
	public int getPatient_Id() {
		return Patient_Id;
	}
	public void setPatient_Id(int patient_Id) {
		Patient_Id = patient_Id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact_no() {
		return Contact_no;
	}
	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}
	public Patient(int patient_Id, String first_name, String last_name, int age, String gender, String contact_no) {
		super();
		Patient_Id = patient_Id;
		First_name = first_name;
		Last_name = last_name;
		this.age = age;
		this.gender = gender;
		Contact_no = contact_no;
	}
	public Patient(String first_name, String last_name, int age, String gender, String contact_no) {
		super();
		First_name = first_name;
		Last_name = last_name;
		this.age = age;
		this.gender = gender;
		Contact_no = contact_no;
	}
	@Override
	public String toString() {
		return "Patient [Patient_Id=" + Patient_Id + ", First_name=" + First_name + ", Last_name=" + Last_name
				+ ", age=" + age + ", gender=" + gender + ", Contact_no=" + Contact_no + "]";
	}
	
	

}
