package facade;

import chapter01.*;

public class VehicleFacade 
{
	public void prepareForSale(Vehicle vehicle)
	{
		Registration reg = new Registration(vehicle);
		reg.allocateVehicleNumber();
		reg.allocateLicensePlate();
		
		Documentation.printBrochure(vehicle);
		
		vehicle.cleanInterior();
		vehicle.cleanExteriorBody();
		vehicle.polishWindows();
		vehicle.takeForTestDrive();
	}
}
