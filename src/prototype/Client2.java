package prototype;

import chapter01.Vehicle;

public class Client2 
{

	public static void main(String[] args) 
	{
		VehicleManagerLazy manager = new VehicleManagerLazy();
		Vehicle saloon1 = manager.createSaloon();
		Vehicle saloon2 = manager.createSaloon();
		Vehicle pickup1 = manager.createPickup();
		
		System.out.println(saloon2);
		System.out.println(pickup1);
	}

}
