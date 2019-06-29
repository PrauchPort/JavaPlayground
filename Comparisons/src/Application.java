import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Branch b1 = new Branch("Oak", 5.0);
		Branch b2 = new Branch("Willow", 4.5);
		Branch b3 = new Branch("Birch", 6.5);
		Branch b4 = new Branch("Cherry", 1.5);
		
		List<Branch> branches = new ArrayList<Branch>();
		
		branches.addAll(Arrays.asList(b1, b2, b3, b4));
		
		System.out.println(branches);
		
		Collections.sort(branches);
		Collections.reverse(branches);
		
		System.out.println(branches);
		
	}

}
