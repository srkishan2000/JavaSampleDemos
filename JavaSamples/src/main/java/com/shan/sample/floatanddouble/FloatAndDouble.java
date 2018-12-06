package com.shan.sample.floatanddouble;

public class FloatAndDouble {

	public static void main(String[] args) {
		/*
		 	There's two data types in Java to deal with 'floating point' numbers.
		And they are called the 'float' and the 'double'. And the 'float' is a 'single' precision,
		and 'double' is 'double' precision unsurprisingly, given the name.
		So essentially, the 'double' data type has got twice as much detail as the 'float'.
		
		I'm going to create a 'float' And to do a 'float' you type in 'float' and we'll call it 'myFloatValue = 5'. Now you can do that, 
		but the proper practice for entering a 'float' is to enter an 'f'. Put an 'f' after the number. 
		Whatever the number is, you put an 'f' at the end to denote it is a 'float' value.
		 */
		
		// EXAMPLE 1
		
		// width of int = 32 (4 bytes)
		int intValue = 5 / 2;  // => here output is 2.5 but will print the value as 2 since int will be automatically rounded
		// width of float = 32 (4 bytes)
		float floatValue = 5f / 2f; // here 2 or 2f for the divisible which will allow and print the same value
		// width of double = 64 (8 bytes)
		double doubleValue = 5d / 2d; // here 2f or 2d for the divisible which will allow and print the same value
		
		System.out.println("intValue : " + intValue);
		System.out.println("floatValue : " + floatValue);
		System.out.println("doubleValue : " + doubleValue);
		
		// EXAMPLE 2
		
		// width of int = 32 (4 bytes)
		int intValue1 = 5 / 3;  // => here output is 1.666666 but will print the value as 1 since int will be automatically rounded
		// width of float = 32 (4 bytes)
		float floatValue1 = 5f / 3f; // here 3 or 3f for the divisible which will allow and print the same value
		// width of double = 64 (8 bytes)
		double doubleValue1 = 5d / 3d; // here 3f or 3d for the divisible which will allow and print the same value
		
		System.out.println("intValue1 : " + intValue1);
		System.out.println("floatValue1 : " + floatValue1);
		System.out.println("doubleValue1 : " + doubleValue1);
		
		
		// Exercise
		
		// Note : 1 pound is equal to 0.45359237 kilograms.
		double numOfPound = 200d; // no problem - you can use here int, float or double datatypes 
		double convertedKilograms = (0.45359237d * numOfPound);
		
		System.out.println("Kilograms : " + convertedKilograms );
	}

}
