
public interface DispenseChain {

	public void setNextDispenseChain(DispenseChain chain);
	
	public void dispense(Currency cur);
}
