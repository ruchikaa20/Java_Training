package OOPconcepts;

public class partTimeEmployee extends Employee{
	
	private int WorkingHour;
	private double salaryPerHour;
	private int noOfDays;

	public int getWorkingHour() {
		return WorkingHour;
	}

	public void setWorkingHour(int workingHour) {
		WorkingHour = workingHour;
	}

	public double getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(double salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public partTimeEmployee(String empName, int empID, String empDept, int WorkingHour, double salaryPerHour, int noOfDays) {
		super(empName, empID, empDept);

		this.WorkingHour = WorkingHour;
		this.salaryPerHour = salaryPerHour;
		this.noOfDays = noOfDays;
	}

	@Override
	double calSalary() {
		double monthSal = WorkingHour*salaryPerHour*noOfDays;
		
		return monthSal;
	}
	
	@Override
	public void displayEmpDetails() {
		super.displayEmpDetails();
		System.out.println("Monthly salary of part time employee is :"+calSalary());
	}

	@Override
	public boolean applyLeave(int days) {
		// TODO Auto-generated method stub
		System.out.println("No leaves permissible");
		return false;
	}

}
