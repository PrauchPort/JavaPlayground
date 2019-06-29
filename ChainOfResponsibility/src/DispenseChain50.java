
public class DispenseChain50 implements DispenseChain{

	private DispenseChain chain;
	
	@Override
	public void setNextDispenseChain(DispenseChain chain) {
		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {
		int num = (int)cur.getAmount()/50;
		cur.setAmount(cur.getAmount()%50.0);
		System.out.println("Giving "+num+" 50 dollars");
		System.out.println(cur.getAmount() + " left!");
		if(cur.getAmount()>0)
		{
			this.chain.dispense(cur);
		}
	}

}
