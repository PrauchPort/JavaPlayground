
public class SportsCar extends CarDecorator implements Car{

	public SportsCar(Car c) {
		super(c);
	}
	
	public void assemble()
	{
		super.assemble();
		System.out.println("Adding features of Sports Car");
	}

}
