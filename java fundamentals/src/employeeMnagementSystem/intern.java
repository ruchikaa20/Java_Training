package employeeMnagementSystem;

public class intern extends employee{
	
private double stipend = 50000;
	public intern(String empName, int empID, String empDept, double baseSalary, int leaveBalance) {
		super(empName, empID, empDept, baseSalary, leaveBalance);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String getName() {
		return empName;
	}

	@Override
	public int getID() {
		return empID;
	}

	@Override
	double calculateSalary() {
		return stipend;
	}

	@Override
	String employmentType() {
		return "Intern";
	}

	@Override
	String provideBenefits() {
		return "Training opportunities";
	}
	
	public int getLeaveBalance() {
		return leaveBalance;
	}


	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = 10;
	}

}
