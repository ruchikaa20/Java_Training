package javaBasics;
import java.util.Scanner;

public class loopingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//sum of first 10 no
		
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("Sum is :"+ sum);
		
		
	//sum of first 10 even no
		
		int sumEven =0;
		for(int i=2; i<=20; i=i+2) {
			sumEven += i;
		}
		System.out.println("Sum of first 10 even no is:"+ sumEven);
		
	//factorial of a no
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer : ");
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i=2; i<=num; i++) {
			fact *= i;
		}
		
		if(num < 0 ) {
			System.out.println("invalid no");
		}
		else {
		System.out.println(fact);
		}
		sc.close();
		
	
		
	//while loop
		
	// sum of first 10 no
		int sumn=0;
		int j = 1;
		while(j<=10) {
			
			sumn += j;
			j++;
		}
		System.out.println("Sum is :"+ sumn);
		
		
	// sum of first 10 even no	
		int sume=0;
		int k = 2;
		while(k<=20) {
			
			sume += k;
			k=k+2;
		}
		System.out.println("Sum of even no  :"+ sume);
		
	// factorial of a no	
		
		System.out.println("Enter a positive integer : ");
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		
		int facto = 1;
		int i=2;
		while( i<=n ) {
			facto *= i;
			i++;
		}
		
		if(n < 0 ) {
			System.out.println("invalid no");
		}
		else {
		System.out.println(facto);
		}
		sc1.close();
	
		
	}

}
