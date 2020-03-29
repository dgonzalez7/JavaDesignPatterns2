package adapter;

import chapter01.*;

public class SuperGreenEngineAdapter extends AbstractEngine
{
	public SuperGreenEngineAdapter(SuperGreenEngine greenEngine)
	{
		super(greenEngine.getEngineSize(), false);
	}
}
