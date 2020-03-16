package prototype;

import chapter01.*;

public class Client 
{

	public static void main(String[] args) 
	{
		VehicleManager manager = new VehicleManager();
		Vehicle saloon1 = manager.createSaloon();
		Vehicle saloon2 = manager.createSaloon();
		Vehicle pickup1 = manager.createPickup();
		
		System.out.println(saloon2);
	}

}
