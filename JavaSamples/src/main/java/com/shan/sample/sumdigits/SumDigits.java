package com.shan.sample.sumdigits;

public class SumDigits {
	
	private static int sumDigits(int n) {
		
		if (n < 10) {
			return -1;
		}
		
		int sum = 0;
		
		// for understanding the logic : 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
		while (n > 0) {
			// extract least significant digit
			int digit = n % 10;
			sum += digit;
			
			// drop the least significant number
			n /= 10; // same as (n = n / 10)
			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int number = 125;
		System.out.println("The sum of the digits in number " + number + " is " + sumDigits(number));

		number = -125;
		System.out.println("The sum of the digits in number " + number + " is " + sumDigits(number));
		
		number = 4;
		System.out.println("The sum of the digits in number " + number + " is " + sumDigits(number));
		
		number = 32123;
		System.out.println("The sum of the digits in number " + number + " is " + sumDigits(number));
	}

}
