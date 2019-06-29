
public class LuxuryCar extends CarDecorator implements Car{

	public LuxuryCar(Car c) {
		super(c);
	}
	
	public void assemble()
	{
		super.assemble();
		System.out.println("Adding features of Luxury Car");
	}
	
	

}
