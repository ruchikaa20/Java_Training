package OOPconcepts;

public class Intern extends Employee{
	
	private double stipend;
	
	public Intern(String empName, int empID, String empDept, double stipend) {
		super(empName, empID, empDept);
		// TODO Auto-generated constructor stub
		this.stipend = stipend;
	}

	@Override
	double calSalary() {
		return stipend;
	}
    
	@Override
	public void displayEmpDetails() {
		super.displayEmpDetails();
		System.out.println("Monthly salary of intern is :"+calSalary());
	}

	@Override
	public boolean applyLeave(int days) {
        if(days <= 3) {
        	System.out.println("Leave for "+days+ " days  granted");
        	return true;
        }
        else {
        	return false;
        }
	}


}
