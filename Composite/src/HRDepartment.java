
public class HRDepartment implements Department{

	public Integer id;
	public String name;
	
	@Override
	public void printName() {
		System.out.println("This is HR Department");
	}
	
}
