package com.shan.sample.migratorybirds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MigratoryBirds {
	
	private static final int MIN = 5;
    private static final int MAX = 2 * (int) Math.pow(10, 5);
    private static Integer birdType = 1;
    
    // Migratory birds
    public static int maxSightedMigratoryBirdsByLowestType(int n, int[] ar) {   	
    	if (n < MIN || n > MAX ) {
    		return 0;
    	}
    	
    	List<Integer> arList = Arrays.stream(ar).boxed().collect(Collectors.toList());
    	
    	// The type numbers of each bird sighted.
    	Map<Integer, Integer> sighted = new HashMap<>();
    	
    	while (birdType < 6) {
    		Long numOfMatches = arList.stream().filter(e -> e.equals(birdType)).count();
    		sighted.put(birdType, Math.toIntExact(numOfMatches));    		
    		birdType++;
    	}
    	
    	// fetching the first max value occurences from the map (sighted)
		/*
		 * Map.Entry<Integer, Integer> maxEntry = sighted.entrySet().stream()
		 * .max(Map.Entry.comparingByValue()).get();
		 */
    	
    	Integer maxSightedLowestBirdType = sighted.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    	
    	/*
		 * System.out.println(sighted); 
		 * System.out.println(maxSightedLowestBirdType);
		 */	
    	
    	return maxSightedLowestBirdType;
      	
    }

	public static void main(String[] args) {
		/*
		 * 
		 * 11 
		 * 1 2 3 4 5 4 3 2 1 3 4
		 * 
		 * Explanation 1 
		 * The different 5 types of birds occur in the following
		 * frequencies: Type 1:2 Type 2:2 Type 3:3 Type 4:3 Type 5:1
		 * 
		 * Expected 3
		 */
		 
		int[] ar3 = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
		System.out.println(maxSightedMigratoryBirdsByLowestType(11, ar3));

	}

}
