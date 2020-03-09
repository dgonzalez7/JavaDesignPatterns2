package chapter01;

public abstract class AbstractCar extends AbstractVehicle
{
	public AbstractCar(Engine engine)
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public AbstractCar(Engine engine, Vehicle.Color color)
	{
		super(engine, color);
	}
}
