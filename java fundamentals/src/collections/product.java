package collections;

import java.util.Objects;


public class product {
	int productID;
	String productName;
	double productPrice;
	String productCategory;
	
	public product(int productID, String productName, double productPrice, String productCategory) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}
	
	public String toString() {
		return "product [Product ID :" +productID+" , Product name: "+ productName+ ", Product price :"+productPrice +" Product Category :"+productCategory+"]" ;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		product other = (product) obj;
		return productID == other.productID ;
	}
	
//	private Queue<product> c= new PriorityQueue<>(Collections.reverseOrder());
	
	
	
	

//	&& Objects.equals(productName, other.productName) for unique name too

/*	
	//comparable interface
	
	@Override
	public int compareTo(product other) {
		return Double.compare(productPrice, other.productPrice);
		return this.productName.compareToIgnoreCase(other.productName);
	}
	
*/	
	
	
	
	
	
}
