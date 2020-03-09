package chapter01;

public abstract class AbstractVehicle implements Vehicle
{
	private Engine engine;
	private Vehicle.Color color;
	
	public AbstractVehicle(Engine engine) 
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public AbstractVehicle(Engine engine, Vehicle.Color color)
	{
		this.engine = engine;
		this.color = color;
	}

	public Engine getEngine() 
	{
		return engine;
	}

	public Vehicle.Color getColor() 
	{
		return color;
	}

	public void paint(Vehicle.Color color)
	{
		this.color = color;
	}
	
	public String toString() 
	{
		return getClass().getSimpleName() + " ( " + engine + " ) ";
	}	
}
