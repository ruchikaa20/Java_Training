package OOPconcepts;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FullTimeEmployee emp1 = new FullTimeEmployee("ruchika", 154 , "IT", 55000, 10200, 7);
		emp1.calSalary();
		emp1.displayEmpDetails();
		emp1.applyLeave(4);
		
		partTimeEmployee emp2 = new partTimeEmployee("khushi", 321 , "marketing", 9, 200, 30);
		emp2.calSalary();
		emp2.displayEmpDetails();
		emp2.applyLeave(2);
		
		Intern emp3 = new Intern("mahima", 259 , "finance", 10200);
		emp3.calSalary();
		emp3.displayEmpDetails();
		emp3.applyLeave(2);
		
		//interface
		
		fullTimeEmpI emp4 = new fullTimeEmpI("prakhar", 32, "IT", 45000, 9);
		emp4.calSalary();
		emp4.displayEmpDetails();
		emp4.organizationPolicy();
		
		partTimeEmpI emp5 = new partTimeEmpI("deepa", 43, "HR", 8, 300, 30);
		emp5.calSalary();
		emp5.displayEmpDetails();
		emp5.organizationPolicy();
		
		InternI emp6 = new InternI("divya", 243, "Management", 25000);
		emp6.calSalary();
		emp6.displayEmpDetails();
		
		employeeInterface.companyTagLine();
	}

}
