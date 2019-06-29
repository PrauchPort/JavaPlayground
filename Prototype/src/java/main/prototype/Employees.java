package prototype;

import java.util.ArrayList;
import java.util.Arrays;


public class Employees implements Cloneable{

	private ArrayList<String> empList;
	
	public Employees()
	{
		empList = new ArrayList<String>();
	}
	
	public void generateDummyData()
	{
		empList.add("Jan");
		empList.add("Marek");
		empList.add("Adam");
	}
	
	
	
	public ArrayList<String> getEmpList() {
		return empList;
	}

	public void setEmpList(ArrayList<String> empList) {
		this.empList = empList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Employees emp = new Employees();
		ArrayList<String> l = new ArrayList<String>();
		for(String element : this.empList)
		{
			l.add(element);
		}
		emp.setEmpList(l);
		return emp;
	}

	
	
	
	
	
}
