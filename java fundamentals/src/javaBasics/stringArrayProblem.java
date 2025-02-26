package javaBasics;
import java.util.Scanner;

public class stringArrayProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number of employees:");
		Scanner sc = new Scanner(System.in);
		int noOfEmployees = sc.nextInt();
		
		String[][] employee = new String[noOfEmployees][4];

		
		for(int i=0; i<noOfEmployees; i++) {
			System.out.println("Enter Details of employee"+(i+1)+ ":");
			System.out.println("Name:");
			employee[i][0] =  sc.next();
			
			System.out.println("Address:");
			employee[i][1] =  sc.next();
			
			System.out.println("Salary:");
			String salaryin = sc.next();
			double salary =  Double.parseDouble(salaryin);
			
			
			employee[i][2] = String.format("%.2f", salary);
			employee[i][3] = String.format("%.2f", salary*3);
		}
		
		
		System.out.printf("   Name  |  Address   |   Salary  |  TotalSalary");

		System.out.println();
		for(String[] emp : employee) {
			for(String num: emp) {
				System.out.printf("  "+num+ "  ");
			}
			System.out.println();
		}
		
	}

}
