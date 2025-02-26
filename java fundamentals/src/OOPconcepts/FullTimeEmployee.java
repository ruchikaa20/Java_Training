package OOPconcepts;

public class FullTimeEmployee extends Employee{

	private double basicSal;
	private double bonus;
	private int leaveDays;

	public FullTimeEmployee(String empName, int empID, String empDept, double basicSal, double bonus, int leaveDays) {
		super(empName, empID, empDept);
		this.basicSal = basicSal;
		this.bonus = bonus;
		this.leaveDays = leaveDays;
	}

	public double getBasicSal() {
		return basicSal;
	}
	
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	double calSalary() {
		return basicSal+bonus;
		
	}
	
	@Override
	public void displayEmpDetails() {
		super.displayEmpDetails();
		System.out.println("Monthly salary of full time employee is :"+calSalary());
	}

	@Override
	public boolean applyLeave(int days) {
		if(days < leaveDays) {
			leaveDays -= days;
			System.out.println("Leave for "+days+ " days granted");
			return true;
		}
		else {
			System.out.println("No leaves left");
			return false;
		}
	}
	
	

}
