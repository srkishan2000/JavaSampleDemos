package com.shan.sample.leapyear;

public class LeapYear {
	
	public static boolean isLeapYear(int year) {
		boolean result = false;
		if (!(year >= 1 && year <= 9999)) {
			result = false;
		} else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			result = true;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1800));
		
	
	}

}
