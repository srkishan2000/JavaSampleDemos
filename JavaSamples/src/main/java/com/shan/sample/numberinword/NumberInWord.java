package com.shan.sample.numberinword;

public class NumberInWord {
	
	public static void printNumberInWord(int number) {
		// using string arrays here
		String[] numberInWords = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
		
		switch(number) {
			case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
				System.out.println(numberInWords[number]);
				break;
			default:
				System.out.println("OTHER");
				break;
		}
				
	}

	public static void main(String[] args) {
		printNumberInWord(0);
		printNumberInWord(2);
		printNumberInWord(3);
		printNumberInWord(7);
		printNumberInWord(8);
		printNumberInWord(9);
		printNumberInWord(18);
		printNumberInWord(-5);
		printNumberInWord(-8);
	}

}
