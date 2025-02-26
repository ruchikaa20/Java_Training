package employeeMnagementSystem;

public abstract class employee implements person{
	protected String empName;
	protected int empID;
	protected String empDept;
	protected double baseSalary;
	protected int leaveBalance;
	
	public employee(String empName, int empID, String empDept, double baseSalary, int leaveBalance) {
		super();
		this.empName = empName;
		this.empID = empID;
		this.empDept = empDept;
		this.baseSalary = baseSalary;
		this.leaveBalance = leaveBalance;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
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

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public int getLeaveBalance() {
		return leaveBalance;
	}


	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = leaveBalance;
	}



	abstract double calculateSalary();
	abstract String employmentType();
	abstract String provideBenefits();
	
	public boolean requestLeaves(int days) {
		if(days < leaveBalance) {
			leaveBalance -= days;
			System.out.println("Leaves granted");
			return true;
		}
		else {
			System.out.println("Leaves not granted");
			return false;
		}
	}
	
	@Override
	public void displayInfo() {
		System.out.println("-------------------------------");
		System.out.println("Emp name: "+empName+ " Emp id: "+empID+ " Department: "+empDept);
		System.out.println("Employment type: "+employmentType());
		System.out.println("Monthly Salary: "+calculateSalary());;
		System.out.println("Leave days: "+leaveBalance);
		System.out.println("benefits: "+provideBenefits());
		System.out.println("");
	}

	
}
