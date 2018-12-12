package com.shan.sample.areacalculator;

public class AreaCalculator {

	public static double area(double radius) {
		if (radius < 0) {
			return -1;
		}
		// Area of a circle = radius * radius * pi - for pi = 3.14159
		return (radius * radius * 3.14159);
	}
	
	public static double area(double x, double y) {
		if (x < 0 || y < 0) {
			return -1;
		}
		// Area of a rectangle = length * width
		return x * y;
	}
	
	public static void main(String[] args) {
		System.out.println(area(5.0));
		System.out.println(area(-1));
		System.out.println(area(5.0, 4.0));
		System.out.println(area(-1.0, 4.0));
	}

}
