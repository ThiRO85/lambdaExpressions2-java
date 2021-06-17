package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(7, 8, 9, 10, 11, 12);
		Predicate<Integer> pred = i -> i % 2 != 0;
		
		beforeJava8(list, pred);
		afterJava8(list);
	}

	private static void beforeJava8(List<Integer> list, Predicate<Integer> pred) {
		List<Integer> list2 = new ArrayList<>();
		for (Integer i : list) {
			if (pred.test(i)) {
				list2.add(i);
			}
		}
		//for (Integer j : list2) {
			System.out.println("Before Java 8: " + list2);
		//}
	}
	
	private static void afterJava8(List<Integer> list) {
		//Stream<Integer> str = list.stream();	
		
		//Stream<Integer> str2 = str.filter(i -> i % 2 == 0);
		
		//List<Integer> list2 = str2.collect(Collectors.toList());
		
		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		//list2.forEach(System.out::println);
		System.out.println("After Java 8: " + list2);
	}
}
