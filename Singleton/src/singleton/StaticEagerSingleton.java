package singleton;

public class StaticEagerSingleton {

	private static StaticEagerSingleton instance;
	
	private StaticEagerSingleton()
	{
		
	}
	
	static {
		try {
			instance = new StaticEagerSingleton();
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public static StaticEagerSingleton getInstance()
	{
		return instance;
	}
	
}
