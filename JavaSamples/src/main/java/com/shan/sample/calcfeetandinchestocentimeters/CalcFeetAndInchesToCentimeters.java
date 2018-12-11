package com.shan.sample.calcfeetandinchestocentimeters;

public class CalcFeetAndInchesToCentimeters {
	
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		
		if (feet < 0 && (inches < 0 || inches > 12)) {
			return -1;
		}
		
		// one inch = 2.54 Cm
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
	
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		
		if (inches < 0) {
			return -1;
		}
		
		// 12 inch = 1 Feet
		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12; 
		
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}

	public static void main(String[] args) {
		double inches = 9 ;
		double feet = 3;
		
		double centimeters = calcFeetAndInchesToCentimeters(inches);
		if (centimeters < 0.0) {
			System.out.println("Invalid Parameters ...");
		} else {
			System.out.println(inches + " inches = " + centimeters + " Cms");
		}
		
		
		centimeters = calcFeetAndInchesToCentimeters(feet,inches);
		if (centimeters < 0.0) {
			System.out.println("Invalid Parameters ...");
		} else {
			System.out.println(feet + " Feet and " + inches + " inches = " + centimeters + " Cms" );
		}
	
	}

}
