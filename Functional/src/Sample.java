import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sample {

	
	public static double addHalf(double num)
	{
		return num + 0.5; 
	}
	
	
	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 5, 4, 7, 8, 9);
		
		Predicate<Integer> isEven = e -> e % 2 == 0;
		
		Function<Integer, Predicate<Integer>> greaterThan = pivot -> num -> num > pivot;
		
		System.out.println(
				numbers.stream()
						.filter(greaterThan.apply(6))
						.filter(isEven)
						.map(e -> (double) e)
						.map(Sample::addHalf)
						.findFirst()
						.get()
				);
		
	}
	
}
