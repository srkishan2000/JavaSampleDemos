package com.shan.sample.lastdigitchecker;

public class LastDigitChecker {
	
	public static boolean hasSameLastDigit(int a, int b, int c) {
		if ((a < 10 || a > 1000) || (b < 10 || b > 1000) || (c < 10 || c > 1000)) {
			return false;
		} 
		
		int aLast = a % 10;
		int bLast = b % 10;
		int cLast = c % 10;
		
		return ((aLast == bLast) || (bLast == cLast) || (cLast == aLast));
	}

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41,22,71));
		System.out.println(hasSameLastDigit(23,32,42));
		System.out.println(hasSameLastDigit(9,99,999));
		System.out.println(hasSameLastDigit(-9,99,999));
		System.out.println(hasSameLastDigit(99,99,9999));
		System.out.println(hasSameLastDigit(1000,32,42));
		System.out.println(hasSameLastDigit(23,31,42));

	}

}
