
public class Application {

	public static void main(String[] args) {
		
		Currency cur = new Currency();
		cur.setAmount(1230);
		
		DispenseChain50 chain50 = new DispenseChain50();
		DispenseChain20 chain20 = new DispenseChain20();
		DispenseChain10 chain10 = new DispenseChain10();
		chain50.setNextDispenseChain(chain20);
		chain20.setNextDispenseChain(chain10);
		chain50.dispense(cur);
		
	}
}
