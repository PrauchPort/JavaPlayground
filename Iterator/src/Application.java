
public class Application {

	
	public static void main(String[] args) {
		
		Radio radio = new Radio();
		
		radio.addChannel(new Channel(ChannelType.ENGLISH, 100.5));
		radio.addChannel(new Channel(ChannelType.POLISH, 100.7));
		radio.addChannel(new Channel(ChannelType.GERMAN, 101.2));
		radio.addChannel(new Channel(ChannelType.ENGLISH, 103.4));
		
		
		ChannelIterator iterator = radio.getIterator(ChannelType.ENGLISH);
		while(iterator.hasNext())
		{
			Channel c = iterator.next();
			System.out.println(c.getFrequency());
		}
		
		
	}
	
}
