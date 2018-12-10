package com.shan.sample.reference;

public class LinearSearch {
	
	/*
	 * Linear Search
	 * Write a method that returns the index of the first occurrence of given integer in a list.
	 * Assume that the index of the first element in the list is zero.
	 * If the number does not exist return -1.
	 * 
	 */
	
	private static Integer[] list = {100, 800, 2500, 10, 56, 5};
	
	public static int search(Integer n, Integer[] list) {
		for (int i = 0; i < list.length; i++) {
			if(list[i].equals(n))
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(search(10, list));
		System.out.println(search(825, list));
		System.out.println(search(100, list));
	}
	
	
	
	
}
