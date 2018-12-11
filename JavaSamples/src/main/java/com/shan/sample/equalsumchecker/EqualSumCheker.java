package com.shan.sample.equalsumchecker;

public class EqualSumCheker {

	public static boolean hasEqualSum(int a, int b, int c) {
		return a + b == c;
	}
	
	public static void main(String[] args) {
		System.out.println(hasEqualSum(1,1,1));
		System.out.println(hasEqualSum(1,1,2));
		System.out.println(hasEqualSum(1,-1,0));
	}

}
