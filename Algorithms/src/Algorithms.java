import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;


public class Algorithms {

	
	public static int Fibonnacci(int num)
	{
		if(num == 1 || num == 2)
			return 1;
		int fibo1 = 1;
		int fibo2 = 1;
		int fibonacci = 2;
		for(int i = 3; i <= num ; i++)
		{
			fibonacci = fibo1 + fibo2;
			fibo2 = fibo1;
			fibo1 = fibonacci;
			System.out.println(fibonacci);
		}
		return fibonacci;
	}
	
	public static boolean isPrime(int num)
	{
		if (num == 1 || num == 2)
			return true;
		
		int sqrt = (int) Math.sqrt(num);
		
		for(int i = 3; i <= sqrt; i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
		
	}
	
	public static boolean isIntAPalindrome(int num)
	{
		Integer numObj = Integer.valueOf(num);
		String intToString = numObj.toString();
		String reverseIntToString = new StringBuilder(intToString).reverse().toString();
		
		if(intToString.equals(reverseIntToString))
			return true;
		else
			return false;
	}
	
	public static int[] removeDuplicates(int[] arr)
	{
		
		List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		HashSet<Integer> intSet = new HashSet<Integer>(integerList);
		int[] arrWithoutDup = new int[intSet.size()];
		int k = 0;
		for(Integer i: intSet)
			arrWithoutDup[k++] = i.intValue();
		
		return arrWithoutDup;
		
	}
	
	public static boolean isAnagram(String word1, String word2)
	{
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		
		
		List<Character> word1Set = word1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> word2Set = word2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		
		if(word1Set.containsAll(word2Set) && word2Set.containsAll(word2Set) && word1Set.size() == word2Set.size())
			return true;
		else
			return false;
		
	}
	
	public static void FizzBuzz()
	{
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
				System.out.print("FizzBuzz");
			else if(i % 3 == 0)
				System.out.print("Fizz");
			else if(i % 5 == 0)
				System.out.print("Buzz");
			else
				System.out.print(i);
		}
	}
	
	public static void main(String[] args) {
		
		FizzBuzz();
		
	}
}
