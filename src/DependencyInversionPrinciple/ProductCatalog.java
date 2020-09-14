package DependencyInversionPrinciple;

import java.util.List;

public class ProductCatalog {
	
	public void listAllProducts() {
		SQLProductRepository sqlProductRepository = new SQLProductRepository();
		
		List<String> allProductNames = sqlProductRepository.getAllProctNames();
		
		//Display product names
		
		
		
	}

}
