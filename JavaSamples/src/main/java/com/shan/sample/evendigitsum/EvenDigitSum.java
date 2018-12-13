package com.shan.sample.evendigitsum;

public class EvenDigitSum {

	public static int getEvenDigitSum(int n) {
		if (n < 0) {
			return -1;
		}
		
		int sum = 0;
		
		// for understanding the logic : 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
		while (n > 0) {
			// extract least significant digit
			int digit = n % 10;
			
			if (digit % 2 == 0)
				sum += digit;
			
			// drop the least significant number
			n /= 10; // same as (n = n / 10)
			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(252));
		System.out.println(getEvenDigitSum(-22));
	}

}
