package com.shan.sample.reference;

public class EvenFibonacciSumNumber {
	
	/*
	 * Even Fibonacci Sum
	 * Write a method that returns the sum of all even Fibonacci numbers. Consider all Fibonacci numbers that are less than or equal to n.
	 * Each new element in the Fibonacci sequence is generated by adding the previous two elements.
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 */

	public static Integer evenFibonacciSum(Integer n) {
		int previousFibonacci = 1;
		int currentFibonacci = 2;
		int evenFibonacciSum = 0;
		
		do {
		    if (currentFibonacci % 2 == 0) {
		        evenFibonacciSum += currentFibonacci;
		    }
		    int newFibonacci = currentFibonacci + previousFibonacci;
		    previousFibonacci = currentFibonacci;
		    currentFibonacci = newFibonacci;
		} while (currentFibonacci < n);
		
		return evenFibonacciSum;
	}
	
	public static void main(String[] args) {
		System.out.println(evenFibonacciSum(10));
		System.out.println(evenFibonacciSum(4));
		System.out.println(evenFibonacciSum(7));
		System.out.println(evenFibonacciSum(50));
	}

}
