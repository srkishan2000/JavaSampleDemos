package com.shan.sample.reference;

public class FizzBuzz {
	
	/*
	 * Fizz Buzz
	 * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
	 * For numbers which are multiples of both three and five return 'FizzBuzz'.
	 * For numbers that are neither, return the input number.
	 */
	
	public static String fizzBuzz(Integer i) {
		String result = "";
		if (i % 3 == 0) {
		    result += "Fizz";
		}
		if (i % 5 == 0) {
		    result += "Buzz";
		}
		if (result.equals("")) {
		    result = i.toString();
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
		System.out.println(fizzBuzz(10));
		System.out.println(fizzBuzz(6));
		

	}

}
