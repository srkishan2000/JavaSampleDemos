package com.shan.sample.minandmaxofintarray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class MinAndMaxOfIntArray {
	
	public static void main(String[] args) {
		int[] numbers = { 8, 2, 6, 7, 0, 1, 4, 9, 5, 3 };
		
		List<Integer> b = Arrays.asList(ArrayUtils.toObject(numbers));
	    int max = (int) Collections.max(b);
	    int min = (int) Collections.min(b);

	    System.out.println("Min number: " + min);
	    System.out.println("Max number: " + max);

	}

}
