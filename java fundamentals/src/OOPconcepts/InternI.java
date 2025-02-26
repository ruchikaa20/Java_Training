package OOPconcepts;

public class InternI implements employeeInterface{
	
	private String empName;
	private int empID;
	private String empDept;
	private double stipend;
	
	public InternI(String empName, int empID, String empDept, double stipend) {
		this.empName = empName;
		this.empID = empID;
		this.empDept = empDept;
		this.stipend = stipend;
	}

	public double calSalary() {
		return stipend;
	}
	
	public void displayEmpDetails() {
		
		System.out.println("Emp name: "+empName);
		System.out.println("Emp ID: "+empID);
		System.out.println("Emp Dept: "+empDept);
		System.out.println("Monthly salary of intern is :"+calSalary());
		System.out.println("---------------------------------");
	}


}
