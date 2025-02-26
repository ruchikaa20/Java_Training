package java8Features;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class productApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<product> products = List.of(
				new product("maggie", "grocery", 250),
				new product("Shoe", "Footwear", 5500),
				new product("Cooker","grocery",1000.00),
				new product("Mobile","electronics",55000),
				new product("Dining set","Kitchen",10000)
				);
		
		List<product> filteredProducts = products.stream()
		                                       .filter(product ->product.getPrice() > 5000 && product.getPrice() <= 50000)
		                                       .collect(Collectors.toList());
		
		List<product> sortedProducts =  products.stream()
												 .sorted(Comparator.comparingDouble(product::getPrice))
												 .collect(Collectors.toList());
		
		List<String> uppercase = products.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList());
		
		
		//calculate average price
		double avgPrice = products.stream().mapToDouble(product::getPrice).average().orElse(0);
		
//		double sum = products.stream().map(product -> product.getPrice()).sum();
		
		System.out.println("filtered Products :" );
		System.out.println(filteredProducts);
		
		System.out.println("sorted Products :" );
		System.out.println(sortedProducts);
		
		System.out.println("Upper case :" );
		System.out.println(uppercase);
		
		System.out.println(avgPrice);
//		System.out.println(sum);
		
	
	}

}
