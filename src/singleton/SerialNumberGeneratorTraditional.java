package singleton;

public class SerialNumberGeneratorTraditional 
{
	// Static members
	private static SerialNumberGeneratorTraditional instance;
	
	public synchronized static SerialNumberGeneratorTraditional getInstance()
	{
		if (instance == null)
		{
			instance = new SerialNumberGeneratorTraditional();
		}
		return instance;
	}
	
	// instance variables
	private int count;
	
	// private constructor
	private SerialNumberGeneratorTraditional() {}
	
	// instance methods 
	public synchronized int getNextSerial()
	{
		return ++count;
	}
}
