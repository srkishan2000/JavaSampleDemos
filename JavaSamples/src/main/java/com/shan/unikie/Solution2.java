package com.shan.unikie;

public class Solution2 {
	/*
	public String solution(int[] T) {
		
		
		
		return null;
	} */

	
	public static void main(String[] args) {
		//int[] T = {-1000, 5 , 8 ,9, 2000000000};
						
		//int[] T = {-5, 20, 30, 0};
		//int[] T = {-5, 0, 10, 20, 22, 30, 0, -2};
		int[] T = {-5, -2, 0, 10, 15, 20, 22, 25, 30, 0, -1, -2};
		//int[] T = {-5, 20, 30, 0};
		
		// each season is 2 here 
 		int eachSeasons = T.length / 4;
		
		String[] season = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};
		
		int seasonFinder = 0;
		Integer test = 0;
		int seasonTemperature = 0;
		
		for(int i = 0; i < T.length ; i++) {
			
			 test = i+1;
			
			 

			if (test % eachSeasons == 0) {
				seasonTemperature = 0;
				
				seasonFinder++;
				
				System.out.println(T[i]);
				seasonTemperature = seasonTemperature + T[i];
				
				System.out.println("----------" + seasonTemperature );
				 
			 } else {
				
				 System.out.println(season[seasonFinder]+ " Season");
				 System.out.println(T[i]);
				 seasonTemperature = seasonTemperature + T[i];
				 
			 }
			
			System.out.println("----------" + seasonTemperature );
			
			
			
			
		
		}}
	
	
	
	
	
	
	
	
	
	
	private int sum (int a , int b) {
		
		
		
		
		
		
		
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	// Get hottest temperature
	public static int maxTemp(int[] array)
	{
	    int max = array[0];

	    // Check and replace max temp
	    for(int i = 1; i < array.length; i++){
	        if(max < array[i])
	            max = array[i];

	    }
	    return max;
	}

	// Get coldest temperature
	public static int minTemp(int[] array)
	{
	    int min = array[0];
	    for(int i = 1; i < array.length; i++){
	        if(min > array[i])
	            min = array[i];
	    }
	    return min;
	}
	
	
	
	
}
