package strategy;

import chapter01.*;

public abstract class AbstractCar extends AbstractVehicle
{
	private GearboxStrategy gearboxStrategy;
	
	public AbstractCar(Engine engine)
	{
		this(engine, Vehicle.Color.UNPAINTED);
	}
	
	public AbstractCar(Engine engine, Vehicle.Color color)
	{
		super(engine, color);
		
		// Starts in standard gearbox mode (more economical)
		gearboxStrategy = new StandardGearboxStrategy();
	}
	
	// Allow the gearbox strategy to be changed...
	public void setGearboxStrategy(GearboxStrategy gs)
	{
		gearboxStrategy = gs;
	}
	
	public GearboxStrategy getGearboxStrategy()
	{
		return gearboxStrategy;
	}
	
	public void setSpeed(int speed)
	{
		// Delegate to strategy in effect...
		gearboxStrategy.ensureCorrectGear(getEngine(), speed);
	}
}
