package OOPconcepts;

public abstract class Employee {
	private String empName;
	private int empID;
	private String empDept;
	public String getEmpNmae() {
		return empName;
	}
	public void setEmpNmae(String empName) {
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	
	public Employee(String empName, int empID, String empDept) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empDept = empDept;
	}
	
	//concrete method
	public void displayEmpDetails() {
		System.out.println("---------------------------------");
		System.out.println("Emp name: "+empName);
		System.out.println("Emp ID: "+empID);
		System.out.println("Emp Dept: "+empDept);
	}
    
	//abstract method
	abstract double calSalary(); 
	public abstract boolean applyLeave(int days);
}
