package javaBasics;
import java.util.Scanner;

public class conditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// if-else ladder
		
		double salary = 50000;
		double rating = 4.7;
		
		if (rating >= 1 && rating <= 2) {
			System.out.println("no increment and salary is :"+ salary);
		} 
		else if (rating >= 2 && rating <= 3.5) {
			System.out.println("increment by 5% and salary is :"+ (salary + 0.05*salary));
		}
		else if (rating >= 3.5 && rating <= 4.5) {
			System.out.println("increment by 8% and salary is :"+ (salary + 0.08*salary));
		}
		else if (rating >= 4.5 && rating <= 5) {
			System.out.println("increment by 10% and salary is :"+ (salary + 0.1*salary));
		}
		else {
			System.out.println("Invalid rating");
		}
		
// switch statements	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your current salary : ");
		double currSalary = sc.nextDouble();
		
		System.out.println("Enter rating: ");
		int ratingg = sc.nextInt();
		
		double hikePercentage = 0.0;
		
		switch(ratingg) {
		case 5:
			hikePercentage = 0.20;
		    break;
		case 4:
			hikePercentage = 0.15;
			break;
		case 3:
			hikePercentage = 0.8;
			break;
		case 2:
			hikePercentage = 0.5;
			break;
		case 1:
			hikePercentage = 0.1;
			break;
		default :
			System.out.println("Invalid rating");
		}
        
		double newSalary = currSalary + (currSalary * hikePercentage);
		System.out.println("new salary is :"+ newSalary);
		sc.close();
	}

}
