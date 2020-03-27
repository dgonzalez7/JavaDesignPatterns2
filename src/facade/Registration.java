package facade;

import chapter01.*;

public class Registration 
{
	private Vehicle vehicle;
	
	public Registration(Vehicle vehicle)
	{
		this.vehicle = vehicle;
	}
	
	public void allocateLicensePlate()
	{
		// Code omitted...
		System.out.println("License plate allocated");
	}
	
	public void allocateVehicleNumber()
	{
		// Code omitted...
		System.out.println("License number allocated");
	}
}
