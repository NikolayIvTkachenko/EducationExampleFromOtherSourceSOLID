package LiskovSubstitutionPrinciple;

public class Ostrich extends Bird {
	
	@Override
	public void fly() {
		throw new RuntimeException();
	}

}
