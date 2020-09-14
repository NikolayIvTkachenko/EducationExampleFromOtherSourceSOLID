package DependencyInjection_DIP;

public class ECommerceMainApplication {
	
	public static void main(String[] args) {
		ProductRepository productRepository = AfterProductFactory.create();
		
		AfterProductCatalog productCatalog = new AfterProductCatalog(productRepository);
		
		productCatalog.listAllProducts();
	}

}
