package com.shan.sample.primenumber;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		
		if (n == 1) {
			return false;
		}
		
		// this for has many loops to satisfy the condition 
		//for (int i = 2; i <= n / 2 ; i++) {
		
		// this loop is perfectly works and is used less than above for loop (CODE OPTIMISED...)
		for (int i = 2; i <= (long) Math.sqrt(n) ; i++) {	
			if (n % i == 0) {
				return false;
			}
		}
		System.out.println("Number " + n + " is Prime ...");
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(13));
		System.out.println(isPrime(14));
		System.out.println(isPrime(15));
		System.out.println(isPrime(17));
	}

}
