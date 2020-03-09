package chapter01;

public class BoxVan extends AbstractVan
{
	public BoxVan(Engine engine)
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public BoxVan(Engine engine, Vehicle.Color color)
	{
		super(engine, color);
	}
}
