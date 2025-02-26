package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayDeque;

public class shoppingCart {
	
	private Queue<product> cart = new PriorityQueue<>(new comparingNamePrice());
//	private ArrayDeque<product> cart = new ArrayDeque<>();
	private Map<Integer, product> cart1 = new HashMap<>();
	private Map<Integer, product> cart2 = new LinkedHashMap<>();
	private Map<Integer, product> cart3 = new TreeMap<>();
	private Scanner sc = new Scanner(System.in);
	
	public void chooseComparison() {
		System.out.println("Which comparison u want: ");
		System.out.println("Press 1: Based on name and price");
		System.out.println("Press 2: Based on category and price");
		System.out.println("Press 3: Based on category and ID");
		int compChoice = sc.nextInt();
		sc.nextLine();
		
		switch(compChoice) {
		case 1:
			cart = new PriorityQueue<>(new comparingNamePrice());
			cart = new ArrayDeque<>();
			break;
//		case 2:
//			cart = new PriorityQueue<>(new comparingCategoryPrice());
//		case 3:
//			cart = new PriorityQueue<>(new comparingCategoryDiscount());
		default :
		System.out.println("Invalid choice, Enter from 1-3");
		}
		
	}
	
	//add product
	public void addProduct() {
		System.out.println("Enter product id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter product name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter product category (electronics/grocery/footwear/kitchen) :");
		String category = sc.nextLine();
		
		System.out.println("Enter product price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		
		product newPro = new product (id, name, price, category);
		
		cart1.put(id, newPro);
//		cart.add(new product(id, name, price, category));
		cart2.put(id, newPro);
		cart3.put(id, newPro);
		System.out.println("Product :"+name+ " added to cart");
		
		
	}
	
	
	//remove product
	public void removeProduct() {
		System.out.println("Enter product id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
//		boolean removed = cart.removeIf(product -> product.productID == id);
		//hashmap		
		if( cart1.remove(id, cart1) || cart2.remove(id, cart2) || cart3.remove(id, cart3))	{
			System.out.println("Product with id : "+id+ " removed from cart");
			cart1.remove(id);
		}
		else {
			System.out.println("Product with id : "+id+ " not found");
		}
		
		
		
	
//		if(removed == true) {
//			System.out.println("Product with id : "+id+ " removed from cart");
//		}
//		else {
//			System.out.println("Product with id : "+id+ " not found");
//		
//		}		
	}
	
	//search product
	public void searchProduct() {
		System.out.println("Enter product name: ");
		String name = sc.nextLine();

		for(product p : cart1.values() ) {
			if(p.productName.equalsIgnoreCase(name))  {
				System.out.println("Product   "+name+ "  found");
			    return;
			}
			else {
				System.out.println("Product with name : "+name+ " not found");
			}
		}
	}
	
	//discount
	public double discount() {
		double discount = 0;

		for(product p: cart1.values()) {
			if(p.productCategory.equalsIgnoreCase("electronics")) {
				discount = 0.10*p.productPrice;
			}
			else if(p.productCategory.equalsIgnoreCase("grocery")) {
				discount = 0.05*p.productPrice;
			}
			else if(p.productCategory.equalsIgnoreCase("footwear")) {
				discount = 0.07*p.productPrice;
			}
			else if(p.productCategory.equalsIgnoreCase("kitchen")) {
				discount = 0.15*p.productPrice;
			}
			else {
				discount = 0;
			}
		}
		return discount;
	}
	
	//checkout product 
	public void checkOut() {
		double Bill = 0;
		double dis=0;
		double totalBill=0;
//		
//		while(!cart1.isEmpty()) {
//			product p = cart1.poll();  //process highest priority queue element
//			
//			
//		}
		
		for(product p: cart1.values()) {
			dis += discount();
			Bill += p.productPrice ;

			System.out.println("Discount applied on "+ p.productName+ " is :" +dis);
		}
		
		totalBill = Bill - dis;
		System.out.println("Total price : INR " +Bill);
		System.out.println("Discount:" +dis);
		System.out.println("Total price to be paid : INR " +totalBill);
		cart.clear();
		System.out.println("Checkout complete. cart is empty");
	}
	
	//display cart products
	public void displayCartProducts() {
		
//      Dequeue methods		
//		product q = cart.peekFirst();
//		product r = cart.peekLast();
//		System.out.println(q);
//		System.out.println(r);
		
		if(cart1.isEmpty() == true ) {
			System.out.println("Cart is empty");
		}
		else {
			System.out.println("Cart Products");
			for(product p: cart1.values()) {
				System.out.println("--------------------------------------");
				System.out.println(p);
			}
		}
	}
	
	public void menu() {
		while(true) {

			System.out.println("Press 1: Add product");
			System.out.println("Press 2: Remove Product");
			System.out.println("Press 3: Search Product");
			System.out.println("Press 4: Display all products");
			System.out.println("Press 5: Checkout");
			System.out.println("Press 6: exit the application");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				addProduct();
				break;
			case 2:
				removeProduct();
				break;
			case 3:
				searchProduct();
				break;
			case 4:
				displayCartProducts();
				break;
			case 5:
				checkOut();
				break;
			case 6:
				System.out.println("Thank You !! Exiting from the system");
				break;
			default :
				System.out.println("Invalid choice, Enter from 1-6");
				sc.close();
			}
			
		}
	}
	

	public static void main(String[] args) {
		
		
		shoppingCart cart = new shoppingCart();
		
		
		cart.chooseComparison();
		cart.menu();
	}
}

