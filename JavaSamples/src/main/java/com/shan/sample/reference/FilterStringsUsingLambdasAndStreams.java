package com.shan.sample.reference;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsUsingLambdasAndStreams {
	
	/*
	 * Filter Strings (Java 8 Lambdas and Streams)
	 * Given a list of Strings, write a method that returns a list of all strings 
	 * that start with the letter 'a' (lower case) and have exactly 3 letters. 
	 * TIP: Use Java 8 Lambdas and Streams API's.
	 */
	
	public static List<String> search(List<String> list) {
		return list.stream()
				  .filter(s -> s.startsWith("S"))
				  .filter(s -> s.length() >= 4)
				  .collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(search(InitializedValues.listOfStrings));
	}

}
