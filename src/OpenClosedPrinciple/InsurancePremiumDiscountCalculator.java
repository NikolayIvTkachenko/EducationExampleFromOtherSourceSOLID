package OpenClosedPrinciple;

public class InsurancePremiumDiscountCalculator {
	
	public int InsurancePremiumDiscountPersent(HealthInsuranceCustomProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		
		return 0;
	}
	
	public int InsurancePremiumDiscountPersent(VehicleInsuranceCustomProfile customer) {
		if(customer.isLoyalCustomer()) {
			return 20;
		}
		
		return 0;
	}
	

}
