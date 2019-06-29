
public class Application {

	
	public static void main(String[] args) {
		
		ComputerBuilder builder = new ComputerBuilder("500GB", "16GB");
		builder.setBluetoothEnabled(true);
		
		Computer computer = new Computer(builder);
		
		System.out.println(computer.toString());
		
		BankAccount account = new BankAccount.Builder(1234).ownedBy("Jan Kowalski").atBranch("Diebold").atInterestRate(2.0).withBalance(1312.3).build();
		
		System.out.println(account.toString());
		
	}
}
