package com.shan.zalando;

import static java.lang.Math.abs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AmplitudeTemperature {
	
	public static String solution(int[] T) {
		
		String[] seasons = {"WINTER","SPRING","SUMMER","AUTUMN"};
		
		if (T.length % seasons.length != 0) {
			return "Missing argument inputs .....";
		}
		
		String result = "";
		int amplitudeTemp = 0;
		int season = 0;
		
		List<Integer> seasonTemp = new ArrayList<Integer>();
		
		for (int i = 0; i < T.length ; i++) {
			
			// Condition for season changing
			if((i+1) % (T.length / seasons.length) == 0) {
				season++;
				seasonTemp.add(T[i]);
				
				// System.out.println("lowTemp : "+getMin(seasonTemp.toArray()));
				// System.out.println("highTemp : "+getMax(seasonTemp.toArray()));
				
				if ( (abs(getMin(seasonTemp.toArray())) +  abs(getMax(seasonTemp.toArray()))) > amplitudeTemp ){
					amplitudeTemp = (abs(getMin(seasonTemp.toArray())) +  abs(getMax(seasonTemp.toArray())));
					result = seasons[season - 1];
				}
				
				seasonTemp = new ArrayList<Integer>();	
				
			} else {
				//System.out.println(">>> " + seasons[season]);				
				seasonTemp.add(T[i]);
			}
		
		}
		
		//System.out.println(">>> " + amplitudeTemp);
		return result;
	}
	
	
	
	public static String solutionEXT(int[] T) {
	    final int count = T.length / 4;
	    int indx = 0;
	    int last = Integer.MIN_VALUE;
	    for (int i = 0; i < 4; ++i) {
	        int diff = IntStream.of(T).skip(count * i).limit(count).max().getAsInt()
	                 - IntStream.of(T).skip(count * i).limit(count).min().getAsInt();
	        if (diff > last) {
	            indx = i;
	            last = diff;
	        }
	    }
	    final String[] seasons = { "WINTER", "SPRING", "SUMMER", "AUTUMN" };
	    return seasons[indx];
	}
	

	// Method for getting the maximum value
	public static int getMax(Object[] objects) {
		int maxValue = (int) objects[0];
		for (int i = 1; i < objects.length; i++) {
			if ((int) objects[i] > maxValue) {
				maxValue = (int) objects[i];
			}
		}
		return maxValue;
	}

	// Method for getting the minimum value
	public static int getMin(Object[] objects) {
		int minValue = (int) objects[0];
		for (int i = 1; i < objects.length; i++) {
			if ((int) objects[i] < minValue) {
				minValue = (int) objects[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
//		int[] T = {-2, -1 , -3, 5, 5, 10, 6, 7}; // -2,-1  -3,5  5,10  6,7  // 3 - 8 - 15 - 13 // SUMMER
//		System.out.println(solution(T));
//		
//		int[] T1 = {-2, -1, 0, -3, 5, 2, 5, 10, 8, 10, 18, 6};  //  -2,0   -3,5   5,10  6,18   // 2 - 8 - 15 - 24 // AUTUMN
//		System.out.println(solution(T1));
//		
		int[] T2 = {-3, -14, -5, 7, 8, 42, 8, 3};
		System.out.println(solutionEXT(T2));
		
		int[] T3 = {2,-3,3,1,10,8,2,5,13, -5, 3, -18};
		System.out.println(solutionEXT(T3));
	}
	
	

}
