package java8Features;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class constructorReference {
	
	public static void main(String[] args) {
		Map<String, Integer> employees = new HashMap<>();
		
		employees.put("Name1", 123);
		employees.put("Name2", 345);
		employees.put("Name3", 678);
		
	    //lambda expression
		employees.keySet().forEach(name -> new employee(name));
		System.out.println("-----------------------------------");		
		
        //constructor reference -> for simpler and short codes
		employees.keySet().forEach(employee :: new);
		
		//Bifunction <T,U,R> -> T,U are return result of Type R (name, id) -> R
		//two input parameters	
		
		BiFunction<String,Integer,employee> employee = (name,id)-> new employee(name,id);  //lambda refernce
		employee.apply("Name1", 123);
		
		
		BiFunction<String,Integer,employee> employee2 = employee :: new; //constructor reference
		employee2.apply("Name2", 3526);
		
		//supplier<T> -> represents a function that does not take any parameter but return an object of type T
		Supplier<employee> empS = ()->new employee();
		empS.get();
		
		Supplier<employee> empS1 = employee :: new;
		empS1.get();
		
		//Function<T,R> -> take one parameter of type T and return object of type R
		Function<String,employee> empF = employee:: new;
		empF.apply("nameN");
		
		//Difference btw function and bifunction is that function takes one parameter and bifuction takes 2 parameter
		
		
		
		
		
		
		
		
		
	}
}
