package LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
	
	
	public static void main(String[] args) {
		
		
		Car first = new Car();
		Car second = new Car();
		Car third = new RacingCar();
		
		List<Car> myCars = new ArrayList<>();
		myCars.add(first);
		myCars.add(second);
		myCars.add(third);
		
		for(Car car: myCars) {
			System.out.println(car.getCabinWidth());
		}
		
	}

}
