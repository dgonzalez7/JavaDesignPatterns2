package singleton;

public enum SerialNumberGenerator 
{
	INSTANCE, ENGINE, VEHICLE;;
	
	
	private int count;
	
	public synchronized int generateNextSerial()
	{
		return ++count;
	}
}
