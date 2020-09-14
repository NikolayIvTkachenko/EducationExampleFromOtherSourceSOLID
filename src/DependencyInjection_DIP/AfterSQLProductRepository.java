package DependencyInjection_DIP;

import java.util.Arrays;
import java.util.List;

public class AfterSQLProductRepository implements ProductRepository {

	@Override
	public List<String> getAllProductNames() {
		
		return Arrays.asList("soap", "toothpaste");
	}

	
	
	
}
