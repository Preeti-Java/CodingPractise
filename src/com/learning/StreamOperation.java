/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream Operation
 */
public class StreamOperation {

	public static void main(String[] args) {
		
		//Creating a ArrayList
		List<String> deptList = new ArrayList<>();
		deptList.add("HR");	
		deptList.add("Social");
		deptList.add("IT");
		deptList.add("Marketing");
		
		//Printing dept by stream
		deptList.stream().map(dept -> dept.toUpperCase()).forEach(System.out::println);
		
		//Flatmap
		flatMapInStream();
		
		Test.test_a = 10;
		
		//Filter
		filterInStream();
		
		//Limit In Stream
		limitInStream();
		
		//Skip In stream
		skipInStream();
		
		//reduce In stream -> for single result Terminal
		reduceInStream();
		
		//collect Terminal
		collectInStream();
		
		//collectAndThen Terminal
		collectAndThen();
	}

	/**
	 * 
	 */
	private static void collectAndThen() {
		List<Product> product = Arrays.asList(new Product("Apple",12500),new Product("Samsung",5825),new Product("Nokia",9521));
		String i =product.stream()
		.collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)),e -> e.isPresent() ? e.get().getProduct(): "Nmae"));
		System.out.println(i);
		
		//Finding the average of a list of integers and then rounding it to the nearest integer:
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer ints  = numbers.stream().collect(Collectors.collectingAndThen(Collectors.averagingInt(Integer::intValue), e -> (int) Math.round(e)));
		System.out.println(ints);
		
		//Getting the maximum value from a list of strings' lengths and then appending some text to it:
	     List<String> words = Arrays.asList("apple", "banana", "orange", "grapefruit");
	    // words.stream().collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(String::length))), StringBuffer::append(" ")))
	}

	/**
	 * 
	 */
	private static void collectInStream() {
		//Creating a ArrayList
		List<String> deptList = new ArrayList<>();
		deptList.add("HR");	
		deptList.add("Social");
		deptList.add("IT");
		deptList.add("Marketing");
		
		deptList.stream().filter(e -> e.startsWith("H")).collect(Collectors.toList()).forEach(System.out::println);;
		
	}

	/**
	 * 
	 */
	private static void reduceInStream() {
		//Creating a ArrayList
				List<String> deptList = new ArrayList<>();
				deptList.add("HR");	
				deptList.add("Social");
				deptList.add("IT");
				deptList.add("Marketing");
				
				String p =deptList.stream().reduce((t, u) -> t.concat(u)).orElse(null);
				System.out.println(p);
	}

	/**
	 * Skip In Stream
	 */
	private static void skipInStream() {
		System.out.println("=========================");
		Stream.iterate(1, n -> n+1).skip(10).limit(25).forEach(System.out::println);
	}

	/**
	 * Limit In Stream
	 */
	private static void limitInStream() {
		System.out.println("=========================");
		Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
	}

	/**
	 * filter Stream
	 */
	private static void filterInStream() {
		//Creating a ArrayList
		List<String> deptList = new ArrayList<>();
		deptList.add("HR");	
		deptList.add("Social");
		deptList.add("IT");
		deptList.add("Marketing");
		
		System.out.println("=========================");
		
		Stream<String> list =  deptList.stream();
		list.filter(e -> e.contains("i")).forEach(System.out::println);
	}

	/**
	 *  FlatMap
	 */
	private static void flatMapInStream() {
		System.out.println("=========================");
		// 1st Example
		String[] arrayOfWords = {"Eazy","Bytes"};
		Stream<String> streamOfWords = Arrays.stream(arrayOfWords);
		
		Stream<String[]> streamOfLetters = streamOfWords.map(word -> word.split(""));
		streamOfLetters.forEach(System.out::println);
		
		System.out.println("=========================");
		//2nd Example
		List<List<String>> list = Arrays.asList(Arrays.asList("Preeti"),Arrays.asList("Rani"));
		System.out.println(list);
		
		list.stream().map(Collection::stream).forEach(System.out::println);
		list.stream().flatMap(Collection::stream).forEach(System.out::println); //Convert into single stream
		
	}
}
