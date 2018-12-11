package com.shan.sample.barkingdog;

public class BarkingDog {
	
	public static boolean bark(boolean barking, int hour) {
		if ( barking && ((hour >= 0 && hour < 8) ||  (hour > 22 && hour <= 24))) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(bark (true, 1));
		System.out.println(bark (false, 2));
		System.out.println(bark (true, 8));
		System.out.println(bark (true, -1));
		System.out.println(bark (true, 0));
		System.out.println(bark (true, 24));
	}

}
