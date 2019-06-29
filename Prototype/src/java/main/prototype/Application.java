package prototype;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {

		Employees e1 = new Employees();
		e1.generateDummyData();
		
		Employees e2;
		try {
			e2 = (Employees)e1.clone();
			ArrayList<String> l1 = e2.getEmpList();
			l1.add("Mateusz");
			
			e2.setEmpList(l1);
			
			System.out.println(e1.getEmpList());
			System.out.println(e2.getEmpList());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
