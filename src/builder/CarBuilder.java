package builder;

import chapter01.*;

public class CarBuilder extends VehicleBuilder
{
	private AbstractCar carInProgress;
	
	public CarBuilder(AbstractCar car) 
	{
		carInProgress = car;
	}
	
	public void buildBody()
	{
		// Add body to carInProgress
		System.out.println("building car body");
	}
	
	public void buildBoot()
	{
		// Add boot to carInProgress
		System.out.println("building car boot");
	}
	
	public void buildChassis()
	{
		// Add chassis to carInProgress
		System.out.println("building car chassis");
	}
	
	public void buildPassengerArea()
	{
		// Add passenger area to carInProgress
		System.out.println("building car passenger area");
	}
	
	public void buildWindows()
	{
		// Add windows to carInProgress
		System.out.println("building car windows");
	}
	
	public Vehicle getVehicle()
	{
		return carInProgress;
	}
}
