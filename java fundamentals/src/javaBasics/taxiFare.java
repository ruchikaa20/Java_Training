/* package javaBasics;
import java.util.Scanner;

//taxi fare  -> function calFare
	// 1. standard -> distance -> 10.Rs per km
	// 2. based on taxi -> suv,25, premium - 20
	// 3. based on distance, type of cab, peaktime(boolean)(t/f) -> true -> surcharge -> 10%, no surcharge
	// function overloading

public class taxiFare {
	double fare =0 ;
	
	public static double taxi(double dist) {
		
		return (dist*10);
	}
	
	public static double taxi(int dist, String type) {
		
		double fare =0 ;
		
		if(type.equalsIgnoreCase("SUV")) {
			fare = dist*25;
		}
		if(type.equalsIgnoreCase("Premium")) {
			fare = dist*20;
		}
		return fare;
	}
	
	public static double taxi(boolean peakTime, double fare) {
		
		if(peakTime==true) {
			fare = 0.1*fare;
		}
		return fare;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(taxi(5));
		System.out.println("Enter cab type:");
		String cabtype = sc.next();
		System.out.println("Is now a Peak time:");
		boolean peaktime = sc.nextBoolean();
		System.out.println(taxi(5, cabtype));
		
		//System.out.println(taxi(peaktime, fare));

	}

}

*/
