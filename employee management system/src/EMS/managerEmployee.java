package EMS;

public class managerEmployee extends fullTimeEmployee implements bonusProvider{
	

	public managerEmployee(String empName, int empID, String empDept, double baseSalary, int leaveBalance, double bonus) {
		super(empName, empID, empDept, baseSalary, leaveBalance, bonus);
	
	}

	@Override
	public double calculateBonus(double salary) {
		
		return salary*bonus_percentage;
	}
	
	@Override
	public double calculateSalary() {
		
		double total = baseSalary + calculateBonus(baseSalary) + bonus;
		
		return total;
	}


}
