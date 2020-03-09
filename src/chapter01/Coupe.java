package chapter01;

public class Coupe extends AbstractCar
{
	public Coupe(Engine engine)
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public Coupe(Engine engine, Vehicle.Color color)
	{
		super(engine, color);
	}
}
