package OOPconcepts;

public class partTimeEmpI implements employeeInterface{
	
	private String empName;
	private int empID;
	private String empDept;
	private double salaryPerHour;
	private int WorkingHour;
	
	public partTimeEmpI(String empName, int empID, String empDept, int WorkingHour, double salaryPerHour, int noOfDays) {

		this.empName = empName;
		this.empID = empID;
		this.empDept = empDept;
		this.WorkingHour = WorkingHour;
		this.salaryPerHour = salaryPerHour;
		
	}

	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		System.out.println("Emp name: "+empName);
		System.out.println("Emp ID: "+empID);
		System.out.println("Emp Dept: "+empDept);
		System.out.println("No leaves permissible");
		System.out.println("---------------------------------");
	}

	public double calSalary() {
		// TODO Auto-generated method stub
		double monthSal = WorkingHour*salaryPerHour*30;
		return monthSal;
	}
	
	public void organizationPolicy() {
		System.out.println("All employees should follow company policy: working hours - flexible hours");
	}
	
	

}
