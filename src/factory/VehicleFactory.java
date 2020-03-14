package factory;

import chapter01.*;

public abstract class VehicleFactory 
{
	public enum DrivingStyle { ECONOMICAL, MIDRANGE, POWERFUL };
	public enum Category { CAR, VAN };
	
	public Vehicle build(DrivingStyle style, Vehicle.Color color)
	{
		Vehicle v = selectVehicle(style);
		
		v.paint(color);
		
		return v;
	}
	
	public static Vehicle make(Category category, DrivingStyle style, Vehicle.Color color)
	{
		VehicleFactory factory = null;
		if (category == Category.CAR)
		{
			factory = new CarFactory();
		}
		else
		{
			factory = new VanFactory();
		}
		
		return factory.build(style, color);
	}
	
	// This is the "factory method"
	protected abstract Vehicle selectVehicle(DrivingStyle style);
}
