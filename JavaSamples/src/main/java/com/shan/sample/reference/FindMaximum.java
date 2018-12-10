package com.shan.sample.reference;

public class FindMaximum {
	
	/*
	 * Find Maximum
	 * Write a method that returns the largest integer in the list.
	 * You can assume that the list has at least one element.
	 */
	
	private static Integer[] list = {100, 800, 2500, 10, 56, 5};
	
	public static Integer findMaximum(Integer[] list) {
		int maximum = list[0];
		for (int i : list) {
		    if (i > maximum) {
		        maximum = i;
		    }
		}
		return maximum;
	}
	 
	public static void main(String[] args) {
		System.out.println(findMaximum(list));
	}

}
