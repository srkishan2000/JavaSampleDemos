package com.shan.sample.unicodechar;

public class UnicodeChar {

	public static void main(String[] args) {
		// width of char is 16 (2 bytes)
		char charValue = '\u00A9';
		
		System.out.println("Unicde output was : " + charValue);
		
		// Exercise 
		char registeredSymbol = '\u00AE';
		System.out.println("Registered Symbol : " + registeredSymbol);
		
		
	}

}
