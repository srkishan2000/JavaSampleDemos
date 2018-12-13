package com.shan.sample.numberpalindrome;

public class NumberPalindrome {

	public static boolean isPalindrome(int number) {
		
		number = Math.abs(number);
		
		int startingNumber = number;
		int reverseNumber = 0;
		
		while (number > 0) {
			int lastDigit = number % 10;
			reverseNumber *= 10;
			reverseNumber += lastDigit;
			
			// to remove the last digit
			number /= 10;
		}
		
		if (startingNumber == reverseNumber) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(-12121));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
	}

}
