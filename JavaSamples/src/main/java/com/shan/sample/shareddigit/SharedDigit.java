package com.shan.sample.shareddigit;

public class SharedDigit {
	
	public static boolean hasSharedDigit(int a, int b) {
		
		if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
			return false;
		} 
		
		return (a / 10 == b / 10) || (a / 10 == b % 10) || (a % 10 == b / 10) || (a % 10 == b % 10);
			
	}

	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
		System.out.println(hasSharedDigit(22, -52));
		System.out.println(hasSharedDigit(-22, 52));
		System.out.println(hasSharedDigit(22, 100));
		System.out.println(hasSharedDigit(122, 52));
	}

}
