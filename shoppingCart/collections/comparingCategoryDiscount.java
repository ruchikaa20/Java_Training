package collections;

import java.util.Comparator;

public class comparingCategoryDiscount implements Comparator<product>{

	@Override
	public int compare(product p1, product p2) {
		// TODO Auto-generated method stub
		int categoryComparison = p1.productCategory.compareTo(p2.productCategory);
		if(categoryComparison == 0) {
			return Double.compare(p1.productID, p2.productID);
		}
		
		return categoryComparison;
	}

}
