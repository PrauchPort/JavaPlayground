
public class DispenseChain10 implements DispenseChain{

	private DispenseChain chain;
	
	@Override
	public void setNextDispenseChain(DispenseChain chain) {
		this.chain = chain;
	}

	@Override
	public void dispense(Currency cur) {
		int num = (int)cur.getAmount()/10;
		cur.setAmount(cur.getAmount()%10.0);
		System.out.println("Giving "+num+" 10 dollars");
		System.out.println(cur.getAmount() + " left!");
		if(cur.getAmount()>0)
		{
			this.chain.dispense(cur);
		}
	}
}
