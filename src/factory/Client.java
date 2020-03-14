package factory;

import chapter01.Vehicle;
import chapter01.Vehicle.Color;

public class Client 
{

	public static void main(String[] args) 
	{
		// I want an economical car, color'ed blue
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.build(VehicleFactory.DrivingStyle.ECONOMICAL, Vehicle.Color.BLUE);
		
		System.out.println(car);
		
		// I want a white van
		VehicleFactory vanFactory = new VanFactory();
		Vehicle van = vanFactory.build(VehicleFactory.DrivingStyle.POWERFUL, Vehicle.Color.WHITE);
		
		System.out.println(van);
		
		// Create a red sports car
		// Uses static make() method
		Vehicle sporty = VehicleFactory.make(VehicleFactory.Category.CAR, VehicleFactory.DrivingStyle.POWERFUL, Color.RED);
		
		System.out.println(sporty);
	}

}
