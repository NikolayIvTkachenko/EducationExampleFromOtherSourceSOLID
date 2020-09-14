package DependencyInversionPrinciple;

import java.util.List;

public class AfterProductCatalog {
	
	public void listAllProducts() {
		
		ProductRepository productRepository = AfterProductFactory.create();
		
		List<String> allProductNames = productRepository.getAllProductNames();
		
		//Display product names
		
	}

}
