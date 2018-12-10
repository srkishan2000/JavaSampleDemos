package com.shan.sample.reference;

public class PackageOfRiceBags {
	
	/*
	 * Package Rice Bags
	 * Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilo each), 
	 * write a method that returns true if it is possible to make a package with goal kilos of rice. 
	 * 
	 *  goal is meant here as (expecting kilo's of Rice...)
	 *  
	 */
	
	public static Boolean packageRice(Integer big, Integer small, Integer goal) {
		boolean result = false;
		if (big * 5 >= goal) {
		    if (small >= goal % 5)
		        result = true;
		} else {
		    if (small >= goal - big * 5) {
		        result = true;
		    }
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(packageRice(2, 5, 20));  // goal is meant here as (expecting kilo's of Rice...)
		System.out.println(packageRice(2, 5, 12));
		System.out.println(packageRice(2, 5, 13));
		System.out.println(packageRice(2, 5, 14));
		System.out.println(packageRice(2, 5, 15));

	}

}
