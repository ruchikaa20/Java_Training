package employeeMnagementSystem;



	


public interface taxable {
	
	//by default public static final
	// constants
	double taxRate = 0.20;
	static void validateSalary(double salary) throws LessIncomeException{
		if(salary <  1200000) {
			throw new LessIncomeException("Not eligible for Tax");
		}
		System.out.println("eligible for Tax");
		
	}
	
	double calculateTax(double salary) ;
	
	

}
