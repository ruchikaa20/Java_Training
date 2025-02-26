package EMS;
import java.util.Scanner;


public class EMSapplication {
	private static employee[] employees;  //created an array
		
	private static int totalemployees = 0;
	private static int maxemployees = 5;
	
	public static void createAccount(Scanner sc) {
		if(totalemployees > maxemployees) {
			System.out.println("Cannot create more accounts");
			return;
		}
		System.out.println("Enter your name: ");
		String empName = sc.nextLine();
		
		System.out.println("Enter your ID: ");
		int empID = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your department: ");
		String empDept = sc.nextLine();
		
		System.out.println("Enter employment type: ");
		
		System.out.println("Press 1: Full time employee");
		System.out.println("Press 2: Part time employee");
		System.out.println("Press 3: Intern");
		System.out.println("Press 4: Manager");
		
		int empType = sc.nextInt();
		
		switch(empType) {
		case 1:
			System.out.println("Enter your base salary:");
			double baseSalary = sc.nextDouble();
			
			System.out.println("Enter your total leaves balance:");
			int leaveBalance = sc.nextInt();
			
			System.out.println("Enter Bonus:");
			double bonus = sc.nextDouble();

			employees[totalemployees] = new fullTimeEmployee(empName, empID, empDept, baseSalary, leaveBalance, bonus);
			System.out.println("Account created Successfully !");
			totalemployees++;
			break;
		
		case 2:
			System.out.println("Enter total working hour per day:");
			int hourPerDay = sc.nextInt();
			
			try {
				workHours.validateWorkingHour(hourPerDay);
			}
			
			
			catch (MoreWorkingHourException e){
				System.out.println(e.getMessage());
			}
			
			System.out.println("Enter salary per hour:");
			double salPerHour = sc.nextDouble();
			
			double salary = hourPerDay*salPerHour*30;
			
			System.out.println("leave not permissible");
			int leave = 0;
	
			employees[totalemployees] = new partTimeEmployee(empName, empID, empDept, salary, leave, hourPerDay, salPerHour);
			System.out.println("Account created Successfully !");
			totalemployees++;
			break;
			
		case 3:
			System.out.println("Your stipend is 50000");
			double stipend = 50000;
			
			System.out.println("Enter leave balance");
			int Internleave = sc.nextInt();
			
			employees[totalemployees] = new intern(empName, empID, empDept, stipend, Internleave);
			System.out.println("Account created Successfully !");
			totalemployees++;
			break;
			
		case 4:
			System.out.println("Enter your base salary: ");
			double manSalary = sc.nextDouble();
			
			System.out.println("Enter leave balance: ");
			int MleaveBalance = sc.nextInt();
			
			System.out.println("Enter Bonus:");
			double Mbonus = sc.nextDouble();
			
			employees[totalemployees] = new managerEmployee(empName, empID, empDept, manSalary, MleaveBalance, Mbonus);
			System.out.println("Account created Successfully !");
			totalemployees++;
			break;
			
		default :
			System.out.println("Invalid choice, Enter from 1-4");
		}
		
	}
	
	public static void displayEmpDetails() {
		if(totalemployees == 0) {
			System.out.println("No employees Available");
			return;
		}
		for(int i=0; i<totalemployees; i++) {
			employees[i].displayInfo();
		}
	}
	
	public static employee findemployee(int id) {
		for(int i=0; i<totalemployees; i++) {
			if(employees[i].getEmpID() == (id)) {
				return employees[i];
			}
		}
		return null;
	}
	
	public static void payrollInfo(Scanner sc) {
		if(totalemployees == 0) {
			System.out.println("No employees Available");
			return;
		}
		for(int i=0; i<totalemployees; i++) {
			payrollManager.generatePayroll(employees[i]);
		}
		
	}
	
	public static void applyLeave(Scanner sc) {
		System.out.println("Enter your employee ID: ");
		int id = sc.nextInt();
		
		employee emp = findemployee(id);
		
		if( emp != null) {
			System.out.println("Enter no of leaves: ");
			int days = sc.nextInt(); 
			emp.requestLeaves(days);
		}
		else
		 {
			System.out.println("Employee not found: ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		employees = new employee[5];
		
		while(true) {
			
			System.out.println("Employee Management System Application menu");
			System.out.println("Press 1: To create an account");
			System.out.println("Press 2: Display employees details");
			System.out.println("Press 3: Display payroll details");
			System.out.println("Press 4: Apply for leave");
			System.out.println("Press 5: exit the application");
			
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				createAccount(sc);
				break;
			case 2:
				displayEmpDetails();
				break;
			case 3:
				payrollInfo(sc);
				break;
			case 4:
				applyLeave(sc);
				break;
			case 5:
				System.out.println("Thank You !! Exiting from the system");
				break;
			default :
				System.out.println("Invalid choice, Enter from 1-6");
				sc.close();
			}

		}

	}

}
