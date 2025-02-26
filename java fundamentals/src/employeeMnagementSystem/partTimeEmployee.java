package employeeMnagementSystem;

public class partTimeEmployee extends employee implements workHours{
	
	private int hourPerDay;
	private double salPerHour;

	public partTimeEmployee(String empName, int empID, String empDept, double baseSalary, int leaveBalance, int hourPerDay, double salPerHour) {
		super(empName, empID, empDept, baseSalary, leaveBalance);
		// TODO Auto-generated constructor stub
		this.hourPerDay = hourPerDay;
		this.salPerHour = salPerHour;
		
	}
	
//	public partTimeEmployee(String empName, int empID, String empDept, int hourPerDay, double salPerHour) {
//		super(empName, empID, empDept, b);
//		// TODO Auto-generated constructor stub
//		this.hourPerDay = hourPerDay;
//		this.salPerHour = salPerHour;
//		
//	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return empName;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return empID;
	}


	@Override
	public int getworkHours() {
		// TODO Auto-generated method stub
		return hourPerDay;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return salPerHour*salPerHour*30;
	}

	@Override
	String employmentType() {
		// TODO Auto-generated method stub
		return "Part Time Employee";
	}

	@Override
	String provideBenefits() {
		return "Employee discount";
	}
	
	

}
