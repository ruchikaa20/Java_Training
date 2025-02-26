package javaBasics;
import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ruchika parmar";
		String s2 = new String("ruchika parmar");
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1==s2);
		
		String pwd = "Admin123";
		
		System.out.println("Enter Password:");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		
		System.out.println(password.equalsIgnoreCase(pwd));
		
		String email = "ruchika20@gmail.com";
		if((email.contains("@")) && (email.endsWith(".com"))) {
			System.out.println("valid email");
		}
		
		else {
			System.out.println("Invalid email");
		}
		
		String pass = "  admin1";
		System.out.println(pass.trim());
		
		String message = "Today is a good day";
		String newMessage = message.replace("good", "nice");
				
		System.out.println(newMessage);
		
	
		
//	StringBuffer
		StringBuffer str = new StringBuffer("Java"); // FSD training is added to original location
		System.out.println(str);
		
		// add some new content -> append() -> combine at end of the string
		str.append("FSD Training");
		System.out.println(str);
		
		//insert at some particular location -> insert()
		str.insert(8, "Day2 ");
		System.out.println(str);
		
		//replace ->
		str.replace(8, 11,"Genpact");
		System.out.println(str);
		
		// delete part of string -> starts with index and deleted till index 1 less than end index
		str.delete(4, 7);
		System.out.println(str);
		
		// reverse()
		str.reverse();
		System.out.println(str);
		
//	StringBuilder
		
		StringBuilder str1 = new StringBuilder("Java");
		System.out.println(str1);
		
		str1.append(" Day1");
		System.out.println(str1);
		
		str1.insert(9, " training");
		System.out.println(str1);
		
		str1.replace(5, 9, "Begineer");
		System.out.println(str1);
		
		str1.delete(5, 14);
		System.out.println(str1);
		
		str1.reverse();
		System.out.println(str1);
	
		
		String first = new String("first");
		String second = "class";
		String joined = first.concat(second);
		System.out.println(joined);
		boolean result = first.equals(second);
		System.out.println(result);
		String ss = first.substring(1);
		System.out.println(ss);
	}

}
