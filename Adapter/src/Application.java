
public class Application {

	public static void main(String[] args) {
		
		SocketAdapterImpl adapter = new SocketAdapterImpl();
		System.out.println(adapter.getVolt12());
		System.out.println(adapter.getVolt3());
		

	}

}
