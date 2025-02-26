package OOPconcepts;

public interface employeeInterface {
	
	//static methods
	static void companyTitle() {
		System.out.println("Genpact");
	}
	
	static void companyTagLine() {
		System.out.println("where transformation happens !!");
	}
	
	//abstract method
	void displayEmpDetails();
	double calSalary();
	
	//Default method
	default void organizationPolicy() {
		System.out.println("All employees should follow company policy: working hours - 9am to 6pm");
	}
	
	

}
