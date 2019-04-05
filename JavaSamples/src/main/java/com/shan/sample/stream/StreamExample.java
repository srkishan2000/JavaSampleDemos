package com.shan.sample.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	
	/*
	 * Java Stream API for Bulk Data Operations on Collections
	 * A new java.util.stream has been added in Java 8 to perform filter/map/reduce like operations with the collection. 
	 * Stream API will allow sequential as well as parallel execution. 
	 * This is one of the best feature for me because I work a lot with Collections and usually with Big Data, 
	 * we need to filter out them based on some conditions.
	 * 
	 * Collection interface has been extended with stream() and parallelStream() default methods to get 
	 * the Stream for sequential and parallel execution. Let’s see their usage with simple example.
	 * 
	 * Notice that parallel processing values are not in order, so parallel processing will be very helpful while working with huge collections.
	 * Covering everything about Stream API is not possible in this post, 
	 * you can read everything about Stream API at Java 8 Stream API Example Tutorial : https://www.journaldev.com/2774/java-8-stream
	 * 
	 */

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
		
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));
		
		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
	}
	
	

}
