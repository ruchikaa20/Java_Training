package javaBasics;
import java.util.Scanner;

public class ordermanagmentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter no of items you want to buy.");
		Scanner sc = new Scanner(System.in);
		int totalItems = sc.nextInt();
		int price;
		int quantity;
		double cost = 0 ;
		double totalOrderCost = 0;
		double discountedPrice;
		double finalCost;
		if(totalItems < 3) {
			System.out.println("Enter at least 3 items.");
		}
		else {
	
			for(int i=1; i<=totalItems; i++) {
				System.out.println("Quantity of item:"+ i);
				quantity = sc.nextInt();
				
				System.out.println("Price of item:"+ i);
				price = sc.nextInt();
			    cost = quantity*price;
				
				System.out.println("Total Cost of item:"+ cost);
				totalOrderCost += cost;

		    }
					
		}
		
		
		System.out.println("---------------------------------------------");
		System.out.println("Bill");
		System.out.println("---------------------------------------------");
		System.out.println("Total Order cost:"+ totalOrderCost);

		if(totalOrderCost >= 5000 && totalOrderCost <= 10000) {
			discountedPrice = totalOrderCost - (0.1*totalOrderCost);
			
			System.out.println("Discount: 10%");
			System.out.println("Discounted cost:"+ discountedPrice);
		}
		

		
		else if (totalOrderCost >= 10000) {
			discountedPrice = totalOrderCost - (0.2*totalOrderCost);
			
			System.out.println("Discount: 20%");
			System.out.println("Discounted cost:"+ discountedPrice);
				
		}
		
		
		else {
			discountedPrice = totalOrderCost;
			
			System.out.println("No Discount");
			System.out.println("Discounted cost:"+ discountedPrice);
				
		}
		
		if(discountedPrice >= 7500) {
			finalCost =  discountedPrice;
			System.out.println("Free shipping");
			System.out.println("Final Cost:"+ finalCost);
		}
		else {
			finalCost =  discountedPrice + 250;
			System.out.println("Shipping Cost = 250");
			System.out.println("Final Cost:"+ finalCost);
		}
		
		System.out.println("---------------------------------------------");
		
		
	}

}
