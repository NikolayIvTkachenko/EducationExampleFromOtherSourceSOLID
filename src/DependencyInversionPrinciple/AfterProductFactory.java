package DependencyInversionPrinciple;

public class AfterProductFactory {

	public static ProductRepository create() {
		return new AfterSQLProductRepository();
	}
	
}
