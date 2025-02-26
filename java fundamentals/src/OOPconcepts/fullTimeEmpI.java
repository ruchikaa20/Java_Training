package OOPconcepts;

public class fullTimeEmpI implements employeeInterface{
	
	private String empName;
	private int empID;
	private String empDept;
	private double basicSal;
	private double bonus;
	
	public fullTimeEmpI(String empName, int empID, String empDept, double basicSal, double bonus) {
		this.empName = empName;
		this.empID = empID;
		this.empDept = empDept;
		this.basicSal = basicSal;
		this.bonus = bonus;
		
	}
	
	public double calSalary() {
		// TODO Auto-generated method stub
		return basicSal+bonus;
	}

	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		System.out.println("Emp name: "+empName);
		System.out.println("Emp ID: "+empID);
		System.out.println("Emp Dept: "+empDept);
		System.out.println("Monthly salary of full time employee is :"+calSalary());
		System.out.println("---------------------------------");
	}
    
	

	

	

}
