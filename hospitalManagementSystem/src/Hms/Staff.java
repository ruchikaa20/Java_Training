package Hms;

public class Staff {
	private int Staff_Id;
	private String Name;
	private String Role;
	private String Contact_no;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getContact_no() {
		return Contact_no;
	}
	public void setContact_no(String contact_no) {
		Contact_no = contact_no;
	}
	public int getStaff_Id() {
		return Staff_Id;
	}
	public void setStaff_Id(int staff_Id) {
		Staff_Id = staff_Id;
	}
	public Staff(int staff_Id, String name, String role, String contact_no) {
		super();
		Staff_Id = staff_Id;
		Name = name;
		Role = role;
		Contact_no = contact_no;
	}
	@Override
	public String toString() {
		return "Staff [Staff_Id=" + Staff_Id + ", Name=" + Name + ", Role=" + Role + ", Contact_no=" + Contact_no + "]";
	}
	public Staff(String name, String role, String contact_no) {
		super();
		Name = name;
		Role = role;
		Contact_no = contact_no;
	}
	
	

}
