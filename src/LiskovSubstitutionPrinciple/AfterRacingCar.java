package LiskovSubstitutionPrinciple;

public class AfterRacingCar  extends AfterVehicle{

	@Override
	public double getInteriorWidth() {
		return this.getCockpitWidth();
	}

	
	public double getCockpitWidth() {
		//return cabin width
		return 1;
	}
	
}
