package javaBasics;
import java.util.Scanner;

public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		a = sc.nextInt();
		System.out.println("Enter b");
		b = sc.nextInt();
		int[] arr = {10, 20, 30, 40};
		try {
			int c = a/b;
			System.out.println("result :"+c);
			
			//not arithmetic exception
			System.out.println(arr[4]);
		}
		
		//multiple catch -> go from specific to general
		catch (ArithmeticException e) {
			System.out.println("Exception caught "+e.getMessage() );
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught "+e.getMessage() );
		}
		catch (Exception e) {
			System.out.println("Exception caught "+e.getMessage() );
		}
		
		finally {
			System.out.println("-----------------");
			sc.close();
		}
		System.out.println("Next code after finally block1");
	}

}
