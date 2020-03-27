
package chapter01;

public interface Vehicle extends Cloneable
{
	public enum Color { UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW };
	
	public Engine getEngine();
	public Vehicle.Color getColor();
	public void paint(Vehicle.Color color);
	
	// Extra methods defined in Vehicle...
	// ... for Facade pattern
	public void cleanInterior();
	public void cleanExteriorBody();
	public void polishWindows();
	public void takeForTestDrive();
	
	public Object clone();
}
