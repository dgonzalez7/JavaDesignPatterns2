package bridge;

public abstract class AbstractEngine implements Engine
{
	private int size;
	private boolean turbo;
	private boolean running;
	private int power;
	
	public AbstractEngine(int size, boolean turbo) 
	{
		this.size = size;
		this.turbo = turbo;
		running = false;
		power = 0;
	}

	public int getSize() 
	{
		return size;
	}

	public boolean isTurbo() 
	{
		return turbo;
	}

	public void start()
	{
		running = true;
		System.out.println("Engine started");
	}
	
	public void stop()
	{
		running = false;
		power = 0;
		System.out.println("Engine stopped");
	}
	
	public void increasePower()
	{
		if (running && (power < 10))
		{
			power++;
			System.out.println("Engine power increased to " + power);
		}
	}
	
	public void decreasePower()
	{
		if (running && (power > 0))
		{
			power--;
			System.out.println("Engine power decreased to " + power);
		}
	}
	
	public String toString() 
	{
		return getClass().getSimpleName() + " ( " + size + " ) ";
	}
}
