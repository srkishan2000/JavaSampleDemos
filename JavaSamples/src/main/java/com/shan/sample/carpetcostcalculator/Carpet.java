package com.shan.sample.carpetcostcalculator;

/**
 * 
 * @author shan
 *
 */

public class Carpet {
	private double cost;

	public Carpet(double cost) {
		this.cost = (cost < 0 ? 0d : cost);
	}
	
	public double getCost() {
		return cost;
	}
}
