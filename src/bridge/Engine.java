package bridge;

public interface Engine 
{
	public int getSize();
	public boolean isTurbo();
	
	// Enhancements
	public void start();
	public void stop();
	public void increasePower();
	public void decreasePower();
}
