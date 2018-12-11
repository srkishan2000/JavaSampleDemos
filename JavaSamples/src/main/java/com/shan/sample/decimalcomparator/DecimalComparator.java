package com.shan.sample.decimalcomparator;

public class DecimalComparator {
	
	public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
		boolean result = false;
		
		if ((int) (d1 * 1000) == (int) (d2 * 1000) ) {
			return true;
		}
        
        return result;
	}

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		
	}

}
