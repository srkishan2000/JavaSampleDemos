package com.shan.sample.reference;

public class CeasarCipher {
	
	/*
	 * Ceasar Cipher
	 * The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with his generals. 
	 * Each letter is replaced by another letter N positions down the English alphabet. 
	 * For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. In case of a 'z', 
	 * the alphabet rotates and it is transformed into a 'd'.
	 * Implement a decoder for the Ceasar cipher where N = 5.
	 * TIP: Use code.toCharArray() to get an array of characters.
	 */
	
	public static String decode(String code) {
		String decoded = "";
		int lastCharValue = 'z';
		int alphabetLength = 'z' - 'a' + 1;
		for (char character: code.toCharArray()) {
		    int charNoRotation = character + 5;
		    int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation - alphabetLength;
		    decoded += (char) charValue;
		}
		return decoded;
	}
	
	// the additional encode is just for testing purpose not included in the questionnaire
	public static String encode(String code) {
		String encoded = "";
		int lastCharValue = 'z';
		int alphabetLength = 'z' - 'a' + 1;
		for (char character: code.toCharArray()) {
		    int charNoRotation = character - 5;
		    int charValue = charNoRotation < lastCharValue ? charNoRotation : charNoRotation + alphabetLength;
		    encoded += (char) charValue;
		}
		return encoded;
	}

	public static void main(String[] args) {
		System.out.println(" Encoded word 'shan' => "+encode("shan"));
		System.out.println(" Decoded word 'shan' => "+decode(encode("shan")));
		System.out.println("--------------------------------------------");
		System.out.println(" Encoded word 'Sridevi' => "+encode("Sridevi"));
		System.out.println(" Decoded word 'Sridevi' => "+decode(encode("Sridevi")));
		System.out.println("--------------------------------------------");
		System.out.println(" Encoded word 'viChu' => "+encode("viChu"));
		System.out.println(" Decoded word 'viChu' => "+decode(encode("viChu")));
		System.out.println("--------------------------------------------");
		System.out.println(" Encoded word 'Ki€hu' => "+encode("Ki€hu"));
		System.out.println(" Decoded word 'Ki€hu' => "+decode(encode("Ki€hu")));
	}

}
