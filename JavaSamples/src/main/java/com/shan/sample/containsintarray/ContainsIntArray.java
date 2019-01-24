package com.shan.sample.containsintarray;

import java.util.stream.IntStream;

public class ContainsIntArray {

	public static void main(String[] args) {
		int[] values = { 1, 33, 55, 66 };
		int testValue = 33;
		boolean contains = IntStream.of(values).anyMatch(x -> x == testValue);
		
		System.out.println(contains);
		
		
		float floatValue = 0.5f;
		System.out.println(String.format("%.6f", floatValue));

	}

}
