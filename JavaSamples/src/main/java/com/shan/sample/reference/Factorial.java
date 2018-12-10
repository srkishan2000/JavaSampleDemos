package com.shan.sample.reference;

public class Factorial {
	
	/*
	 * Factorial
	 * Write a method that calculates the factorial of a given number.
	 * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
	 * TIP: To make it more interesting, try to do it recursively.
	 * 
	 */

	public static Integer factorial(Integer n) {
		int factorial = n;
		for (int j = n - 1; j > 0; j--) {
		    factorial = factorial * j;
		}
		return factorial;
	}
	
	public static void main(String[] args) {
		
		System.out.println(factorial(4));
		System.out.println(factorial(12));
		System.out.println(factorial(6));

	}

}
