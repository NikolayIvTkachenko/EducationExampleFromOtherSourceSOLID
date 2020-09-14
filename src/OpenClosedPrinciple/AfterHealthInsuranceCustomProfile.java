package OpenClosedPrinciple;

import java.util.Random;

public class AfterHealthInsuranceCustomProfile implements AfterCustomerProfile {

	@Override
	public boolean isLoyalCustomer() {
		
		//return true;
		return new Random().nextBoolean();
	}

	

}
