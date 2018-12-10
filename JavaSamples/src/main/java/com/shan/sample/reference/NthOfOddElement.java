package com.shan.sample.reference;

import java.util.List;

public class NthOfOddElement {
	
	/*
	 * Nth Odd Element
	 * Write a method that returns the nth element of a list. 
	 * If the index of the element exceeds the list size, then return -1.
	 */
	
	public static Integer getElement(List<Integer> list, Integer n) {
		int elementIndex = 2 * (n-1);
		return elementIndex > list.size() - 1 ? -1 : list.get(elementIndex);
	}
	 
	public static void main(String[] args) {
		System.out.println(getElement(InitializedValues.listOfIntegers, 3));

	}

}
