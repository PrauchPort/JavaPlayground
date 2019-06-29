
public class DispenseChain20 implements DispenseChain{

	private DispenseChain chain;
	
	@Override
	public void setNextDispenseChain(DispenseChain chain) {
		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {
		int num = (int)cur.getAmount()/20;
		cur.setAmount(cur.getAmount()%20.0);
		System.out.println("Giving "+num+" 20 dollars");
		System.out.println(cur.getAmount() + " left!");
		if(cur.getAmount()>0)
		{
			this.chain.dispense(cur);
		}
	}
}
