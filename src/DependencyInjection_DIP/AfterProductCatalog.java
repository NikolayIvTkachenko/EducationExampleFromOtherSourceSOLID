package DependencyInjection_DIP;

import java.util.List;

public class AfterProductCatalog {
	
	
	private ProductRepository productRepository;
	
	public AfterProductCatalog(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public void listAllProducts() {
		
		ProductRepository productRepository = AfterProductFactory.create();
		
		List<String> allProductNames = productRepository.getAllProductNames();
		
		//Display product names
		
	}

}
