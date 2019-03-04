package com.shan.sample.factorial;

public class Factorial {
	
	private static int factorial(int num) {
		if(num == 1)
			return 1;
		
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
	
		// "Factorial 5 : " + 
		//System.out.printf("%3f", factorial(5));
		System.out.println("Factorial 5 : " + factorial(5));
		
//		System.out.println(" ");
//		System.out.println("****************");
		
		// "Factorial 15 : " + 
		//System.out.printf("%3f", factorial(15));
		System.out.println("Factorial 15 : " + factorial(15));

	}

}
