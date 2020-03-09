package chapter01;

public abstract class AbstractVan extends AbstractVehicle
{
	public AbstractVan(Engine engine) 
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public AbstractVan(Engine engine, Vehicle.Color color)
	{
		super(engine, color);
	}

}
