package singleton;

public class Application {

	public static void main(String[] args) {

		EagerSingleton es = EagerSingleton.getInstance();
		LazySingleton ls = LazySingleton.getInstance();
		StaticEagerSingleton ses = StaticEagerSingleton.getInstance();
		
		System.out.println(es.toString());
		System.out.println(ls.toString());
		System.out.println(ses.toString());
		
	}

}
