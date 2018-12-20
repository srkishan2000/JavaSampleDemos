package com.shan.sample.generaterandomnumber;

public class GenerateRandomNumber {
	
	public static int randomNumber() {
		// formulae between the range of two number are upper and lower.
		// int r = (int) (Math.random() * (upper - lower)) + lower;
		
		// is return the value from 1 to 5
		//return (int) ( Math.random() * 5 ) + 1 ;
		
		// is return the value between 9 to 19 in the range
		return (int) (Math.random() * (19 - 9)) + 9 ; 
	}
	
	

	public static void main(String[] args) {
	
		for (int i = 0; i < 20 ; i ++ ) {
			System.out.println(randomNumber());
		}
		
	}

}
