package LiskovSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class AfterVehicleUtils {

public static void main(String[] args) {
		
		
		AfterVehicle first = new AfterVehicle();
		AfterVehicle second = new AfterVehicle();
		AfterVehicle third = new AfterRacingCar();
		
		List<AfterVehicle> myVehicles = new ArrayList<>();
		myVehicles.add(first);
		myVehicles.add(second);
		myVehicles.add(third);
		
		for(AfterVehicle v: myVehicles) {
			System.out.println(v.getInteriorWidth());
		}
		
	}
	
}
