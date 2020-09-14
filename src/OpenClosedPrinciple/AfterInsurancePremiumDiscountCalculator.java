package OpenClosedPrinciple;

public class AfterInsurancePremiumDiscountCalculator {

	public int InsurancePremiumDiscountPersent(AfterCustomerProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		
		return 0;
	}
	
}
