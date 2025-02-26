package javaBasics;

import java.io.FileReader;
import java.io.IOException;

public class c1 {
	
	static void checkAge(int age) {
		if(age < 18) {
			throw new ArithmeticException("Not eligible for to open bank account");
		}
		System.out.println("eligible for to open bank account");
	}
	
	//method for throws
	
	static void readFile() throws IOException{  //declaring an exception
		FileReader file = new FileReader("xyz.txt");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge(22);
		try {
			readFile();
		}
		catch (IOException e){
			System.out.println("exception handled :"+e.getMessage());
		}
		
		
		
		
	}

}












