package adapter;

import java.util.ArrayList;
import java.util.List;

import chapter01.*;

public class Client 
{

	public static void main(String[] args) 
	{
		List<Engine> engines = new ArrayList<Engine>();
		
		engines.add(new StandardEngine(1300));
		engines.add(new StandardEngine(1600));
		engines.add(new TurboEngine(2000));
		
		// "Adapt" the new engine type...
		SuperGreenEngine greenEngine = new SuperGreenEngine(1200);
		engines.add(new SuperGreenEngineAdapter(greenEngine));
		
		for (Engine engine : engines)
		{
			System.out.println(engine);
		}
	}

}
