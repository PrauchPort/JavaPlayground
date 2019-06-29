import java.util.ArrayList;

public class HeadDepartment implements Department{

	public Integer id;
	public String name;
	
	private ArrayList<Department> departments;
	
	public HeadDepartment()
	{
		departments = new ArrayList<Department>();
		departments.add(new HRDepartment());
		departments.add(new ITDepartment());
		departments.add(new HRDepartment());
	}
	
	@Override
	public void printName() {
		for(Department element: departments)
		{
			element.printName();
		}
		
	}
	
}
