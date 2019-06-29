
public class ComputerBuilder {

	private String HDD;
	private String RAM;
	
	private boolean isBluetoothEnabled;
	private boolean isGraphicsCardEnabled;
	
	

	public ComputerBuilder(String hDD, String rAM) {
		HDD = hDD;
		RAM = rAM;
	}

	public String getHDD() {
		return HDD;
	}

	public void setHDD(String hDD) {
		HDD = hDD;
	}

	public String getRAM() {
		return RAM;
	}

	public void setRAM(String rAM) {
		RAM = rAM;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public void setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
	}
	
	
}
