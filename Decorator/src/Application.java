
public class Application {

	public static void main(String[] args) {
		
		BasicCar c = new BasicCar();
		SportsCar sc = new SportsCar(c);
		sc.assemble();
		System.out.println("\n");
		
		LuxuryCar lc = new LuxuryCar(new SportsCar(new BasicCar()));
		lc.assemble();
	}

}
