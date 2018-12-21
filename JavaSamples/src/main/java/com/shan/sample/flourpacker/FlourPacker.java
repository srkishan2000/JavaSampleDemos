package com.shan.sample.flourpacker;

public class FlourPacker {
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		
		if (bigCount < 0 || smallCount < 0 || goal < 0) {
			return false;
		}
		
		if (goal <= (bigCount * 5) + smallCount) {
			goal %= 5;	
		}
		
		if (goal <= smallCount) {
			return true;
		}
		
		return false;	
	}

	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 5));
		System.out.println(canPack(1, 1, 5));
		System.out.println(canPack(0, 5, 8));
		System.out.println(canPack(0, 5, 3));
	}

}
