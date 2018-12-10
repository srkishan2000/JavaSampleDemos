package com.shan.sample.reference;

import java.util.Random;

public class SplitTheRange {
	
	static int start = 1000000000;
	static long end = 9999999999L;

	public static void main(String[] args) {
		
		Random rn = new Random();
		Long longvalue = createRandomInteger(start, end, rn );
		
		System.out.println(longvalue);
		
		
		
		for (int i = 0; i < 1000; i++) {
			if ( longvalue >= start && longvalue <= end) {
				System.out.println(longvalue);
			}
			longvalue = rn.nextLong();
		}	
		
		
		
		
	}
	
	
	
	private static Long createRandomInteger(int aStart, long aEnd, Random aRandom){
	    if ( aStart > aEnd ) {
	      throw new IllegalArgumentException("Start cannot exceed End.");
	    }
	    //get the range, casting to long to avoid overflow problems
	    long range = aEnd - (long)aStart + 1;
	    //logger.info("range>>>>>>>>>>>"+range);
	    // compute a fraction of the range, 0 <= frac < range
	    long fraction = (long)(range * aRandom.nextDouble());
	    
	    //logger.info("fraction>>>>>>>>>>>>>>>>>>>>"+fraction);
	    long randomNumber =  fraction + (long)aStart;    
	    
	    return randomNumber;

	  }
	
	
	
	
	
	
}
