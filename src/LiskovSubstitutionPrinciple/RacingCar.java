package LiskovSubstitutionPrinciple;

public class RacingCar extends Car {
	
	@Override
	public double getCabinWidth() {
		//UNIMPLEMENTING
		
		return 0.0;
	}
	
	
	public double getCockpitWidth() {
		//return cockpit width
		
		return 2.0;
	}

}
