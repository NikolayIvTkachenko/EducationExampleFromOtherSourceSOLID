package LiskovSubstitutionPrinciple;

public class AfterCar  extends AfterVehicle {
	
	@Override
	public double getInteriorWidth() {
		return this.getCabinWidth();
	}

	
	public double getCabinWidth() {
		//return cabin width
		return 2;
	}
	
}
