package chapter01;

public interface Vehicle extends Cloneable
{
	public enum Color { UNPAINTED, BLUE, BLACK, GREEN, RED, SILVER, WHITE, YELLOW };
	
	public Engine getEngine();
	public Vehicle.Color getColor();
	public void paint(Vehicle.Color color);
	
	public Object clone();
}
