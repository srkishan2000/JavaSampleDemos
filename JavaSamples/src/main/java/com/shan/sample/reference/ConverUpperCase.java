package com.shan.sample.reference;

import java.util.List;
import java.util.stream.Collectors;

public class ConverUpperCase {
	
	/*
	 * Convert to Upper Case (Java 8 Lambdas and Streams)
	 * Write a method that converts all strings in a list to their upper case.
	 */
	
	public static List<String> upperCase(List<String> list) {
		return list.stream()
				  .map(String::toUpperCase)
				  .collect(Collectors.toList());
	}
	 

	public static void main(String[] args) {
		System.out.println(upperCase(InitializedValues.listOfStrings));
	}

}
