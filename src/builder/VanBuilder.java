package builder;

import chapter01.*;

public class VanBuilder extends VehicleBuilder
{
	private AbstractVan vanInProgress;
	
	public VanBuilder(AbstractVan van) 
	{
		vanInProgress = van;
	}
	
	public void buildBody()
	{
		// Add body to vanInProgress
		System.out.println("building van body");
	}
	
	public void buildChassis()
	{
		// Add chassis to vanInProgress
		System.out.println("building van chassis");
	}
	
	public void buildReinforcedStorageArea()
	{
		// Add storage area to vanInProgress
		System.out.println("building van storage area");
	}
	
	public void buildWindows()
	{
		// Add windows to vanInProgress
		System.out.println("building van windows");
	}
	
	public Vehicle getVehicle()
	{
		return vanInProgress;
	}
}
