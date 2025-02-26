package EMS;



public class payrollManager {
	
	//taking emp as an object
	public static void generatePayroll(employee emp) {
		
		double salary = emp.calculateSalary();
		double tax=0;
		
		try {
			taxable.validateSalary(salary);
			if(emp instanceof taxable) {
				tax = ((taxable) emp).calculateTax(salary) ;
			}
		}
		
		
		catch (LessIncomeException e){
			System.out.println("Tax eligibility failed "+e.getMessage());
		}
		
		double netSalary = salary - tax;
		
		
		
		System.out.println("-------------------------");
		System.out.println("Payroll for :" +emp.getEmpName());
		System.out.println("Monthly Salary :" +salary);
		System.out.println("Tax deduction :" +tax);
		System.out.println("Net salary :" +netSalary);
		System.out.println("");
	}

}
