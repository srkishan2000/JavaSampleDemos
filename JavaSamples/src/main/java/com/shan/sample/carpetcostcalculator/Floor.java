package com.shan.sample.carpetcostcalculator;

/**
 * 
 * @author shan
 *
 */

public class Floor {
	
	private double width;
	private double length;
	
	public Floor(double width, double length) {
		this.width = (width < 0 ? 0d : width);
		this.length = (length < 0 ? 0d : length);
	}
	
	public double getArea() {
		return width * length;
	}

}
