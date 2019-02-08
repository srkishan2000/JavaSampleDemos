package com.shan.sample.speedconverter;

/**
 * 
 * @author shan
 *
 */

/*
 * 1. Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return rounded value of the calculation of type long.

	If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
	
	Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
	
	
	
	Examples of input/output:
	
	* toMilesPerHour(1.5); → should return value 1
	
	* toMilesPerHour(10.25); → should return value 6
	
	* toMilesPerHour(-5.6); → should return value -1
	
	* toMilesPerHour(25.42); → should return value 16
	
	* toMilesPerHour(75.114); → should return value 47
	
	
	2. Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
	
	This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
	
	Then it needs to print a message in the format "XX km/h = YY mi/h".
	
	XX represents the original value kilometersPerHour.YY represents the rounded milesPerHour from the kilometersPerHour parameter.
	
	If the parameter kilometersPerHour is < 0 then print the text "Invalid Value".
	
	
	Examples of input/output:
	
	* printConversion(1.5); → should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
	
	* printConversion(10.25); → should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
	
	* printConversion(-5.6); → should print the following text (into the console - System.out): Invalid Value
	
	* printConversion(25.42); → should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
	
	* printConversion(75.114); → should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h
	
	
	TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.
	
	NOTE: Use methodMath.round to round the number of calculated miles per hour(double). The method round returns long.
	
	NOTE: All methods should be defined as public static like we have been doing so far in the course.
	
	NOTE: 1 mile per hour is 1.609 kilometers per hour
	
	Exception : NOTE: Do not add the main method to the solution code.
 * 
 */

public class SpeedConverter {
	
	private static final Double K2M =  1.609D;
	
	public static Long toMilesPerHour(Double kilometersPerHour) {
		
		if (kilometersPerHour < 0)
			return -1L; 
		
		return Math.round(kilometersPerHour/K2M);
		
	}
	
	public static void printConversion(Double kilometersPerHour) {
		
		if (kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			// Print XX km/h = YY mi/h
			
			System.out.println( kilometersPerHour + " km/h = " + Math.round(kilometersPerHour/K2M) + " mi/h");
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printConversion(1.5);
		printConversion(25.42);
		printConversion(-5.42);
		
		System.out.println(toMilesPerHour(1.5));
		System.out.println(toMilesPerHour(25.42));
		System.out.println(toMilesPerHour(-5.42));
		
	}

}
