package com.shan.sample.reference;

public class ReverseString {

	/*
	 * Reverse String
	 * Write a method that reverses a string.
	 * For example, 'java interview' becomes 'weivretni avaj'.
	 */
	public static String reverse(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
		    result += s.charAt(s.length() - i - 1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("java interview"));

	}

}
