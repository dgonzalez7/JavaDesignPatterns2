package bridge;

public class Client 
{

	public static void main(String[] args) 
	{
		Engine engine = new StandardEngine(1300);
		AbstractDriverControls controls1 = new StandardControls(engine);
//		StandardControls controls1 = new StandardControls(engine);
		
		controls1.ignitionOn();
		controls1.accelerate();
		controls1.brake();
		controls1.ignitionOff();
		
		SportControls controls2 = new SportControls(engine);
		controls2.ignitionOn();
		controls2.accelerate();
		controls2.accelerateHard();
		controls2.brake();
		controls2.ignitionOff();
	}
}
