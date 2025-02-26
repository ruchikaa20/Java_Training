package javaBasics;
import java.util.Scanner;

public class functionsConcept {
	
	
	
	public static String checkEvenOdd(int num) {
		return(num % 2 == 0) ? "Even" : "Odd" ;
	}
	
	public static String greetingMsg(String name) {
		return("hello "+ name +" Welcome to India");
	}

	public static int cubeNumber(int n) {
		return(n*n*n);
	}
	public static long factorialNum(int num) {
		long fact = 1;
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	//method overloading - method parameters should be different 
	//changing return type is not method overloading
	public static int addNumber(int a, int b) {
		return (a+b);
	}
	
	public static int addNumber(double a, int b) {
		return (int) (a+b);  //typecasting
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.sqrt(234));
		System.out.println(checkEvenOdd(4));
		System.out.println("Enter your name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println(greetingMsg(name));
		System.out.println(cubeNumber(4));
		System.out.println("Enter a num:");
		
		int n = sc.nextInt();
		System.out.println(factorialNum(n));

	}

}
