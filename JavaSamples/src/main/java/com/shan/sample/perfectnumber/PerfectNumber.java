package com.shan.sample.perfectnumber;

public class PerfectNumber {
	
	public static boolean isPerfectNumber(int number) {
		if (number < 0)
			return false;
		
		int sum = 0;
		int i = 1;
		while ( i < number) {
			if (number % i == 0) {
				//System.out.println("### : "+i);
				sum += i;
			}
			i++;
		}
		
		return ((sum > 0) && (sum == number));
		
	}

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));
		System.out.println(isPerfectNumber(28));
		System.out.println(isPerfectNumber(5));
		System.out.println(isPerfectNumber(-1));
		System.out.println(isPerfectNumber(0));
	}

}
