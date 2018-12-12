package com.shan.sample.minutestoyearsdayscalculator;

public class MinutesToYearsDaysCalculator {
	
	public static void printYearsAndDays(long minutes) {
		if (minutes < 0 ) {
			System.out.println("Invalid Value ...");
		} else {
			/*
			 * one hour = 60 minutes
			 * one day = 24 hours
			 * one year = 365 day's 
			 */
			
			long year = (((minutes / 60 ) / 24 ) / 365 );
			long remainingDays = (((minutes / 60 ) / 24 ) % 365 );
			
			System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d" );
		}
	}

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
		printYearsAndDays(-525600);
	}

}
