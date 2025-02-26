package java8Features;

import java.util.Arrays;
import java.util.Optional;
import java.util.StringJoiner;

public class stringJoiner {

	public static void main(String[] args) {
		// string joiner - join string with a delimeter
	
		StringJoiner sj = new StringJoiner(" : ");
		sj.add("name1");
		sj.add("name2");
		sj.add("name3");
		System.out.println(sj.toString());
		
		StringJoiner sj1 = new StringJoiner(" , ","\"","\"");
		sj1.add("name1");
		sj1.add("name2");
		sj1.add("name3");
		System.out.println(sj1.toString());
		
		//optional calss helps in avoiding null point exception
		Optional<String> name = Optional.of("java");
		name.ifPresent(n->System.out.println("name is :"+n));
		
		Optional<String> name1 = Optional.empty();
		name1.ifPresent(n->System.out.println("name is :"+n));
		
		//array parallel sort
		//multicore cpu -> improve performance 
		//divide into subArrays itnernally , sort and again merge 
		
		double[] StockPrices = {123, 124, 676, 86654, 56544, 62, 2331, 831};
		Arrays.parallelSort(StockPrices);
		System.out.println("sorted aaray parallely: "+Arrays.toString(StockPrices));
		
		
		
		
		
		
		
		
		
	
	}

}
