package LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class AfterPricingUtils {

	
	public static void main(String[] args) {
		
		
		Product first = new Product();
		Product second = new Product();
		Product third = new InHouseProduct();
		
		List<Product> productList  = new ArrayList<>();
		productList.add(first);
		productList.add(second);
		productList.add(third);
		
		for(Product p: productList ) {
			System.out.println(p.getDiscount());
		}
	
		
	}
	
}
