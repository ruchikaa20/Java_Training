package collections;

import java.util.Comparator;

public class comparingNamePrice implements Comparator<product>{

	@Override
	public int compare(product p1, product p2) {
		// TODO Auto-generated method stub
//		int categoryComparison = p2.productName.compareTo(p1.productName);
//		if(categoryComparison == 0) {
			return Double.compare(p2.productPrice, p1.productPrice);
//		}
		
//		return categoryComparison;
	}

}
