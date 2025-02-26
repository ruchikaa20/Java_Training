package javaBasics;
import java.util.Scanner;

public class array2DAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter no of student:");
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		int[][] student = new int[noOfStudents][3];
		
		for(int i=0; i<noOfStudents; i++) {
			System.out.println("Enter marks of all subjects: ");
			
				for(int j=0; j<3; j++) {
					student[i][j] = sc.nextInt();
				}
			
		}
		
		for(int i=0; i<student.length; i++) {
			double sum = 0;
			for(int j=0; j<student[i].length; j++) {
				sum += student[i][j];
			}
			System.out.println("percentage: "+(sum/3));
		}
	}

}
