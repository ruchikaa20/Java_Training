package java8Features;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Maths{
	int operate(int a, int b); //interface with single abstract method known as functional interface 
	                           //lambda functions are usually used for such interfaces 
}


//even we have interface with more than one method lambda expressions will not work 
public class lambdaExpressions{

	public static void main(String[] args) {
		// lambda function
		
		// (parameters) -> operation
		// single like code no {} required
		
		Maths add = (a,b) -> a+b;
		System.out.println(add.operate(12, 18));
		
		Maths sub = (a,b) -> a-b;
		System.out.println(sub.operate(18, 12));
		
		List<String> names = Arrays.asList("ruchika", "khushi", "deepa");
		List<String> names1 = new ArrayList<>();
		
		
		//stream
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
		List<Integer> incNumbers = numbers.stream().map(n -> n+10).collect(Collectors.toList());
		
		int resultSum = numbers.stream().map(n->n*2).mapToInt(Integer::intValue).sum();
		
		names1.add("java");
		names1.add("training");
		
		names.sort((s1,s2) -> s1.compareTo(s2));
		System.out.println(names);
		
		//for each loop
		names1.forEach(name -> System.out.println(name));
		
		System.out.println(evenNumbers);
		System.out.println(incNumbers);
		
	}

}
