package DependencyInjection_DIP;

public class AfterProductFactory {

	public static ProductRepository create() {
		return new AfterSQLProductRepository();
	}
	
}
