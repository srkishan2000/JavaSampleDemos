package com.shan.sample.numbertowords;

public class NumberToWords {
	
	public static void numberToWords(int number) {
		
		if (number < 0) {
			System.out.println("Invalid Value");
		} else {
		
			// using string arrays here
			String[] numberInWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
					
			int reverseNumber = reverse(number);
	        int digitsCount = getDigitCount(number);
	 
	        while (digitsCount > 0) {
	        	int lastDigit = reverseNumber % 10;
	        	System.out.println(numberInWords[lastDigit]);
	        	reverseNumber /= 10;
	            digitsCount--;
	        	
	        }		
			
		}
				
	}
	
	public static int reverse(int number) {
		int reverseNumber = 0;
		while (number != 0) {
			int lastDigit = number % 10;
			
			reverseNumber *= 10;
			reverseNumber += lastDigit;
			
			// to remove the last digit
			number /= 10;
		}
		
		return reverseNumber;
	}
	
	public static int getDigitCount(int number) {
		if (number < 0)
            return -1;
    
        return String.valueOf(number).length();
	}
	

	public static void main(String[] args) {
		
		numberToWords(-2);
		
		System.out.println(reverse(-2));
		
		numberToWords(3052);
		System.out.println("****");
		numberToWords(100);
		System.out.println("****");
		numberToWords(10);
		System.out.println("****");
		numberToWords(0);
		
		numberToWords(101);
		System.out.println("****");
		numberToWords(1450);
		
	}

}
