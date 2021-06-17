package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Java 1");
		list.add("Java 2");
		list.add("Java 3");
		list.add("Java 4");
		list.add("Java 5");
		
		System.out.println("Java list original: " + list);
		
		List<String> list2 = list.stream()
				.flatMap(x -> Stream.of(x.toUpperCase(), x.toLowerCase(), x.concat(" Tes!")))
						.collect(Collectors.toList());
						
						System.out.println("Java list using flat map: " + list2);
	}
}
