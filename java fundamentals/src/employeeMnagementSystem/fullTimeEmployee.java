package employeeMnagementSystem;

//multiple inheritance through interface
public class fullTimeEmployee extends employee implements taxable, workHours{
	
	protected double bonus;

	public fullTimeEmployee(String empName, int empID, String empDept, double baseSalary, int leaveBalance, double bonus) {
		super(empName, empID, empDept, baseSalary, leaveBalance);
		this.bonus = bonus;
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
	public int getworkHours() {
		return standard_workHours;
	}

	@Override
	public double calculateTax(double salary) {
		return salary*0.20;
	}

	@Override
	double calculateSalary() {
		return baseSalary+bonus;
	}

	@Override
	String employmentType() {
		return "Full Time Employee";
	}

	@Override
	String provideBenefits() {
		return "Health Insaurance , access to retirement benefits ";
	}
	
	public int getLeaveBalance() {
		return leaveBalance;
	}


	public void setLeaveBalance(int leaveBalance) {
		this.leaveBalance = 15;
	}

	

}
