
public class SocketAdapterImpl implements SocketAdapter{

	private Socket socket;
	
	public SocketAdapterImpl() {
		socket = new Socket();
	}

	@Override
	public Volt getVolt3() {
		return new Volt(socket.getVolt()/30);
	}

	@Override
	public Volt getVolt12() {
		return new Volt(socket.getVolt()/10);
	}

	@Override
	public Volt getVolt24() {
		return new Volt(socket.getVolt()/5);
	}

	
	
	
}
