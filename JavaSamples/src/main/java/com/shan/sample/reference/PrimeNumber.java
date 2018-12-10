package com.shan.sample.reference;

public class PrimeNumber {
	
	/*
	 * Prime Number
	 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself. 
	 * Write a method that checks if a number is prime number.
	 */
	
	public static Boolean isPrime(Integer n) {
		 for (int i = n - 1; i > 1; i--) {
		     if (n % i == 0) {
		         return false;
		     }
		 }
	 return true;
	}
	
	public static void main(String[] args) {

		System.out.println(" is Prime 11 :"+isPrime(11));
		System.out.println(" is Prime 13 :"+isPrime(13));
		System.out.println(" is Prime 10 :"+isPrime(10));

	}

}
