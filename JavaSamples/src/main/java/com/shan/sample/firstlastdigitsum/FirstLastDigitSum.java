package com.shan.sample.firstlastdigitsum;

public class FirstLastDigitSum {
	
	public static int sumFirstAndLastDigit(int n) {
		
		if (n < 0) {
			return -1;
		} 
		
		// extract least significant digit
		int lastDigit = n % 10;
		
		// for understanding the logic : 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
		while (n > 9) {
			// drop the least significant number
			n /= 10; // same as (n = n / 10)
		}
		
		return n + lastDigit;
	}

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
		System.out.println(sumFirstAndLastDigit(10));
	}

}
