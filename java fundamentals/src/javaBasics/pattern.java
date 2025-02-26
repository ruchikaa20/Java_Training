package javaBasics;
import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter rows: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for(int i=1; i<=rows; i++) {
			
			for(int j=rows-i; j>0; j--) {
				System.out.print(" ");
			}
			
			
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			
			System.out.println(" ");
		}
		

	}

}
