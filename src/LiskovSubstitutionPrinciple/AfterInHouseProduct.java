package LiskovSubstitutionPrinciple;

public class AfterInHouseProduct extends Product{
	
	
	@Override
	public double getDiscount() {
		this.applyExtraDiscount();
		return discount;
	}
	
	
	public void applyExtraDiscount() {
		discount = discount * 1.5f;
	}

}
