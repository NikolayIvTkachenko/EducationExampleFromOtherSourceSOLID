package DependencyInversionPrinciple;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository {

	public List<String> getAllProctNames(){
		return Arrays.asList("soap", "toothpaste");
	}
	
	
}
