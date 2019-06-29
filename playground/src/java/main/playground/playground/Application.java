package playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	
	public static void main(String[] args) {
		
		
		
		Artist a1 = new Artist("Paris");
		Artist a2 = new Artist("Berlin");
		Artist a3 = new Artist("London");
		
		//ArrayList<Artist> artistArray = new ArrayList<Artist>();
		
		ArrayList<Artist> artistArray = (ArrayList<Artist>) Stream.of(a1, a2, a3).collect(Collectors.toList());
		
		
		int count = 0;
		for(Artist artist: artistArray)
		{
			if(artist.getCity().equals("London"))
				count++;
		}
		System.out.println(count);
		
		int count1 = 0;
		Iterator<Artist> iterator = artistArray.iterator();
		while(iterator.hasNext())
		{
			Artist artist = iterator.next();
			if(artist.getCity().equals("London"))
				count1++;
		}
		System.out.println(count1);
		
		int count2 = (int)artistArray.stream().filter(artist -> artist.getCity().equals("London")).count();
		System.out.println(count2);
		
		artistArray.stream().filter(artist -> {
			System.out.println(artist.getCity());
			return artist.getCity().equals("London");
		});
		
		artistArray.stream().filter(artist -> {
			System.out.println(artist.getCity());
			return artist.getCity().equals("London");
		}).count();
		
		List<String> collected = Stream.of("a","b","c").collect(Collectors.toList());
		
		System.out.println(collected);
		
		List<String> collectedUppercase = Stream.of("a", "b", "c").
											map(string -> string.toUpperCase()).
											collect(Collectors.toList());
		
		System.out.println(collectedUppercase);
		
		List<String> beginningWithNumbers = new ArrayList<>();
		for(String value : Arrays.asList("1av", "abc", "Ui", "12Back"))
		{
			if(isDigit(value.charAt(0)))
				beginningWithNumbers.add(value);
		}
		System.out.println(beginningWithNumbers);
		
		
		List<String> beginningWithNumbers1 = Stream.of("1av", "abc", "Ui", "12Back").
													filter(string -> isDigit(string.charAt(0))).
													collect(Collectors.toList());
		
		System.out.println(beginningWithNumbers1);
		
		
		List<Integer> intList = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).
										flatMap(numbers -> numbers.stream()).
										collect(Collectors.toList());
		
		System.out.println(intList);
		
		List<Track> tracks = Arrays.asList(new Track("Track A", 123),
											new Track("Track B", 237),
											new Track("Track C", 52),
											new Track("Track D", 413)
				);
		
		Track shortestTrack = tracks.stream().min(Comparator.comparing(track -> track.getLength())).get();
		
		System.out.println(shortestTrack.getLength());
		
		int sum = Stream.of(1, 2, 3, 4, 5).reduce(0, (accumulator, element) -> accumulator + element);
		
		System.out.println(sum);
		
		
		
	}
	
	public static boolean isDigit(char a)
	{
		return (int)a >= 48 && (int)a <=57;
	}
	
	
	
}
