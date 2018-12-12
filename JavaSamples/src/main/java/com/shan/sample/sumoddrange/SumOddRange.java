package com.shan.sample.sumoddrange;

public class SumOddRange {
	
	public static boolean isOdd(int n) {
		if( n < 0 ) {
			return false;
		} else if (!(n % 2 == 0)) {
			return true;
		} else {
			return false;
		}
	} 
	
	public static int sumOdd(int start, int end) {
		
		if ( (start <= 0 || end <= 0) || (end < start) ){
			return -1;
		} 
		
		int sum = 0;
		for (int i = start ; i <= end ; i++) {
			if (isOdd(i)) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
	
		System.out.println(sumOdd(5, 5));
		System.out.println(sumOdd(-1, 5));
		System.out.println(sumOdd(5, 0));
		System.out.println(sumOdd(7, 5));
		System.out.println(sumOdd(5, -1));
		System.out.println(sumOdd(-1, -1));
		
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
		
		System.out.println(sumOdd(1, 11));
		
	}

}
