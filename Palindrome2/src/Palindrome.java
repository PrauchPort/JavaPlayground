import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Stream;

public class Palindrome {

	public static boolean isPalindrome1(String string)
	{
		char[] charArr = string.toCharArray();
		
		for(int i = 0; i <charArr.length/2; i++)
		{
			if(charArr[i] != charArr[charArr.length-1-i])
				return false;
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome1("sajkdhjkahd"));
		
		Person p1 = new Person("Jan", "Kowalski", 23);
		
		Person p2 = new Person("Jan", "Nowak", 31);

		Person p3 = new Person("Wojciech", "Prazuch", 24);
		
		Map<Person, Integer> personMap = new HashMap<Person, Integer>();
		
		personMap.put(p1, 10);
		personMap.put(p2, 13);
		personMap.put(p3, 43);
		
		
		
	}
	
	
}
