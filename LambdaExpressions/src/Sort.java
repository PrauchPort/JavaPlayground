import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Sort {
	
	
	public static <T> T betterString(T s1, T s2, BiPredicate<T, T> pred)
	{

		if(pred.test(s1, s2))
			return s1;
		else
			return s2;
		
	}

	public static void main(String[] args) {
		
		String[] stringArray = new String[] {"Ala", "rower", "dlugi wyraz jak nie wiem", "Wojtek", "wideokamera", "aparat", "Zabrze"};

		System.out.println(Arrays.toString(stringArray));
		
		String[] stringArrayByLength = stringArray;
		Arrays.sort(stringArrayByLength, (s1, s2) -> s1.length() - s2.length());
		System.out.println(Arrays.toString(stringArrayByLength));
		
		String[] stringArrayByLengthRev = stringArray;
		Arrays.sort(stringArrayByLengthRev, (s1, s2) -> s2.length() - s1.length());
		System.out.println(Arrays.toString(stringArrayByLengthRev));
		
		String[] stringArrayByFirstChar = stringArray;
		Arrays.sort(stringArrayByFirstChar, (s1, s2) -> s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0));
		System.out.println(Arrays.toString(stringArrayByFirstChar));
		
		
		BiPredicate<Integer, Integer> whichStringBetter = (s1, s2) -> s2 > s1;
		
		System.out.println(betterString(7, 6, whichStringBetter));
		
		
		
	}

}
