package InversionOfControl_IOC;

public class AfterProductFactory {

	public static ProductRepository create() {
		return new AfterSQLProductRepository();
	}
	
}
