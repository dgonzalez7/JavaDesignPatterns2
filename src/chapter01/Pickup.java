package chapter01;

public class Pickup extends AbstractVan
{
	public Pickup(Engine engine)
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public Pickup(Engine engine, Vehicle.Color color)
	{
		super(engine, color);
	}
}

