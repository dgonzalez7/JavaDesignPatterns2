package facade;

import chapter01.*;

public class Client 
{
	public static void main(String[] args) 
	{
        Vehicle car = new Saloon(new StandardEngine(1300));
        VehicleFacade facade = new VehicleFacade();
        facade.prepareForSale(car);
	}
}
