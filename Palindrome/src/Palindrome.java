
public class Palindrome {

	
	public static boolean isPalindrome(String word)
	{	
		String word1 = new StringBuilder(word).reverse().toString();
		
		if(word.equals(word1))
			return true;
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Palindrome.isPalindrome("Madam"));

		System.out.println(Palindrome.isPalindrome("mama"));

		System.out.println(Palindrome.isPalindrome("kajak"));

		System.out.println(Palindrome.isPalindrome("blazej"));
		
	}
	
}
