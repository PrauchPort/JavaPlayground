
public class Computer {

	private String HDD;
	private String RAM;
	
	private boolean isBluetoothEnabled;
	private boolean isGraphicsCardEnabled;
	
	public Computer(ComputerBuilder builder)
	{
		this.HDD = builder.getHDD();
		this.RAM = builder.getRAM();
		this.isBluetoothEnabled = builder.isBluetoothEnabled();
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((HDD == null) ? 0 : HDD.hashCode());
		result = prime * result + ((RAM == null) ? 0 : RAM.hashCode());
		result = prime * result + (isBluetoothEnabled ? 1231 : 1237);
		result = prime * result + (isGraphicsCardEnabled ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		if (HDD == null) {
			if (other.HDD != null)
				return false;
		} else if (!HDD.equals(other.HDD))
			return false;
		if (RAM == null) {
			if (other.RAM != null)
				return false;
		} else if (!RAM.equals(other.RAM))
			return false;
		if (isBluetoothEnabled != other.isBluetoothEnabled)
			return false;
		if (isGraphicsCardEnabled != other.isGraphicsCardEnabled)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isBluetoothEnabled=" + isBluetoothEnabled
				+ ", isGraphicsCardEnabled=" + isGraphicsCardEnabled + "]";
	}
	
	
	
	
}
