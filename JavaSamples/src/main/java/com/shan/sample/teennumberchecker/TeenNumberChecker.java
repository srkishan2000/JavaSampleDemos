package com.shan.sample.teennumberchecker;

public class TeenNumberChecker {
	
	public static boolean hasTeen(int age1, int age2, int age3) {
		return isTeen(age1) || isTeen(age2) || isTeen(age3);
	}
	
	public static boolean isTeen(int age) {
		return age > 12 && age < 20;
	}
	

	public static void main(String[] args) {
		System.out.println(hasTeen(9,99,19));
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(22,23,34));
	}

}
