package com.shan.sample.reference;

public class GreatestCommonDivisor {
	
	/*
	 * Greatest Common Divisor
	 * The Greatest Common Divisor of two positive integers is the largest integer that divides both without remainder.
	 * Write a method that returns the Greatest Common Divisor of p and q.
	 */
	
	public static Integer gcd(Integer p, Integer q) {
		if (q == 0) {
		    return p;
		}
		return gcd(q, p % q);
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(157854824, 548756));
	}

}
