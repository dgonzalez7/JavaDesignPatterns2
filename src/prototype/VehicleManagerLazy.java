package prototype;

import chapter01.*;

public class VehicleManagerLazy 
{
	private Vehicle saloon, coupe, sport, boxVan, pickup;
	
	public VehicleManagerLazy()
	{
		// Empty constructor
	}
	
	public Vehicle createSaloon()
	{
		if (saloon == null)
		{
			saloon = new Saloon(new StandardEngine(1300));
			return saloon;
		}
		else
		{
			return (Vehicle) saloon.clone();
		}
	}
	
	public Vehicle createCoupe()
	{
		if (coupe == null)
		{
			coupe = new Coupe(new StandardEngine(1300));
			return coupe;
		}
		else
		{
			return (Vehicle) coupe.clone();
		}
	}
	
	public Vehicle createSport()
	{
		if (sport == null)
		{
			sport = new Sport(new StandardEngine(1300));
			return sport;
		}
		else
		{
			return (Vehicle) sport.clone();
		}
	}
	
	public Vehicle createBoxVan()
	{
		if (boxVan == null)
		{
			boxVan = new BoxVan(new StandardEngine(1300));
			return boxVan;
		}
		else
		{
			return (Vehicle) boxVan.clone();
		}
	}
	
	public Vehicle createPickup()
	{
		if (pickup == null)
		{
			pickup = new Pickup(new StandardEngine(1300));
			return pickup;
		}
		else
		{
			return (Vehicle) pickup.clone();
		}
	}
}
