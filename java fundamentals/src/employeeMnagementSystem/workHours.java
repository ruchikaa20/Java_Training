package employeeMnagementSystem;

public interface workHours {
	
	//constants
	
	int standard_workHours = 40;
	
	static void validateWorkingHour(int getworkHours) throws MoreWorkingHourException{
		if(getworkHours >  20) {
			throw new MoreWorkingHourException("More working Hours");
		}
		System.out.println("Valid working hours");
		
	}
	
	//abstract method
	int getworkHours();

}
