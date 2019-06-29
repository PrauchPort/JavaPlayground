import java.util.ArrayList;
import java.util.List;

public class Radio implements ChannelCollection{

	private List<Channel> channelList;
	
	public Radio() {

		channelList = new ArrayList<Channel>();
		
	}

	public List<Channel> getChannelList() {
		return channelList;
	}

	@Override
	public void addChannel(Channel channel) {
		channelList.add(channel);
		
	}
	
	public ChannelIteratorImpl getIterator(ChannelType type)
	{
		return new ChannelIteratorImpl(type);
	}
	
	
	private class ChannelIteratorImpl implements ChannelIterator
	{
		private ChannelType type;
		private int index;
		
		
		
		public ChannelIteratorImpl(ChannelType type) {
			this.type = type;
			index = 0;
		}

		@Override
		public boolean hasNext() {
			while(index < channelList.size())
			{
				if(channelList.get(index).getType() == type)
				{
					return true;
				}
				else
					index++;
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channelList.get(index);
			index++;
			return c;
		}
		
	}
	
	
	
	
	


	@Override
	public ChannelIterator iterator(ChannelType type) {
		// TODO Auto-generated method stub
		return null;
	}}
