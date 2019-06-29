
public class Channel {
	
	private ChannelType type;
	private double frequency;
	
	public Channel(ChannelType type, double frequency) {
		super();
		this.type = type;
		this.frequency = frequency;
	}
	
	public ChannelType getType() {
		return type;
	}
	public void setType(ChannelType type) {
		this.type = type;
	}
	public double getFrequency() {
		return frequency;
	}
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	
	
}
