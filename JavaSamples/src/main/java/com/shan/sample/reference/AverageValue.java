package com.shan.sample.reference;

import java.util.List;

public class AverageValue {
	
	/*
	 * Average Value (Java 8 Lambdas and Streams)
	 * Write a method that returns the average of a list of integers.
	 */
	
	
	public static Double average(List<Integer> list) {
		return list.stream()
				  .mapToInt(i -> i)
				  .average()
				  .getAsDouble();
	}
	 

	public static void main(String[] args) {
		System.out.println(average(InitializedValues.listOfIntegers));
	}

}
