package com.shan.sample.iteration;

public class SeasonalTemperature {
	
	public static String solution(int[] T) {
		
		String[] seasons = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};
		
		int eachSeasons = T.length / seasons.length;
		int season = 0;
		int seasonTemperature = 0;
		int lowestTemp = 1000;
		int highestTemp = -1000;
		String result = "";
		
		for (int i = 0; i < T.length; i++) {
			//System.out.println((i+1) % eachSeasons == 0);
			if((i+1) % eachSeasons == 0) {
				//System.out.println(seasons[season]);
				seasonTemperature = seasonTemperature + Math.abs(T[i]);
				//System.out.println(seasons[season] + " >>> : "+seasonTemperature);  // seasonTemperature
				if(lowestTemp > seasonTemperature) {
					lowestTemp = seasonTemperature;
					//System.out.println("The lowest Temperature is " +lowestTemp+ " in the " + seasons[season] + " Season on the year.");
					//result = "The lowest Temperature is " +lowestTemp+ " in the " + seasons[season] + " Season on the year.";
				}
				if(highestTemp < seasonTemperature) {
					highestTemp = seasonTemperature;
					//System.out.println("The Highest Temperature is " +highestTemp+ " in the " + seasons[season] + " Season on the year.");
					result = "The Highest Temperature is " +highestTemp+ " in the " + seasons[season] + " Season on the year.";
				}
				season++;
				seasonTemperature = 0;
			} else {
				//System.out.println(seasons[season]);
				seasonTemperature = seasonTemperature + Math.abs(T[i]);
			}
		}
		
		System.out.println("Lowest Temp : "+lowestTemp);
		System.out.println("Highest Temp : "+highestTemp);
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] test1 = {2, 1, 1, 10, 2, 13, 3, -18};
		System.out.println(solution(test1));  // FIX -  WRONG ANSWER  (got SUMMER expected AUTUMN) 
		
			/*int[] test1 = {-2, -10, 2, 10, 15, 30, 15, 5 };
			System.out.println(solution(test1));  // Summer 45
			
			int[] test2 = {-2, -10, -15, 2, 10, 12, 15, -30, 32, 15, 5 , 2};
			System.out.println(solution(test2));  // Spring 24
			
			int[] test3 = {-2, -10, -12, -15, 2, 10, -10, 12, 15, -30, 28, -32, 15, 5, 1, 2};
			System.out.println(solution(test3));  // Autumn 23
			
			int[] test4 = {-2, -10, 8, -12, -15, -2, -10, -10, -10, -12, -15, -30, -10, -28, -32, -15, -5, -15, -1, -2};
			System.out.println(solution(test4));  // winter -31
*/			
		}

}


