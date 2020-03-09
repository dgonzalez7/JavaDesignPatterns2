package chapter01;

public class Saloon extends AbstractCar
{
	public Saloon(Engine engine) 
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public Saloon(Engine engine, Vehicle.Color color)
	{
		super(engine, color);
	}
}
