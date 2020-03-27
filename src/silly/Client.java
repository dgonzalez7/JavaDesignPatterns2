package silly;

public class Client 
{

	public static void main(String[] args) 
	{
		System.out.println("Initiated...");
		int limit = 1000;
		
		
		for (int i = 0; i < limit; i++)
		{
//			System.out.println(i);
			TimeWaster tw = new TimeWaster(i);
		}

	}

}
