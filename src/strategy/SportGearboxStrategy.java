package strategy;

import chapter01.Engine;

public class SportGearboxStrategy implements GearboxStrategy 
{
	public void ensureCorrectGear(Engine engine, int speed) 
	{
			int engineSize = engine.getSize();
			boolean turbo = engine.isTurbo();
			
			// Some complicated code to determine correct gear
			// ...setting based on engineSize, turbo & speed, etc.
			
			System.out.println("Working out correct gear at " + speed + "mph for a SPORT gearbox");
	}
}
