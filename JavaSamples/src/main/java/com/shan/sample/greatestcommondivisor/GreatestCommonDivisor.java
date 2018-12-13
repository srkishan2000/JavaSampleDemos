package com.shan.sample.greatestcommondivisor;

public class GreatestCommonDivisor {
	
	public static int getGreatestCommonDivisor(int first, int second) {
	    if (first < 10 || second < 10) {
	        return -1;
	    }
	    
	     while (first != second) {
	    	if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        
        return second; // either print first or second values 
		
	}

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25, 15));
		System.out.println(getGreatestCommonDivisor(15, 24));
	}

}
