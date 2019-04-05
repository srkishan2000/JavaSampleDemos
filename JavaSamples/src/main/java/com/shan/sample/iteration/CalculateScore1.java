package com.shan.sample.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class CalculateScore1 {
	
	private static final String STRIP_STRING = "abcdefghijklmnopqrstuvwxyz";

	public static void main(String[] args) {
		String[] R= {"Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded"};
		String[] T= {"test1a", "test2", "test1b", "test1c", "test3"};	
		System.out.println(findHowManyGroupsPassed(T,R));		
		
		System.out.println("*********");
		
		String[] R1= {"Wrong answer", "OK", "OK", "Runtime error", "OK"};
		String[] T1= {"codility1", "codility3", "codility2", "codility4b", "codility4a"}; 		
		System.out.println(findHowManyGroupsPassed(T1,R1));
		
		System.out.println("*********");
		
		String[] R2= {"Wrong answer", "OK", "OK", "OK", "OK"};
		String[] T2= {"codility1", "codility3", "codility2", "codility4b", "codility4a"}; 
		System.out.println(findHowManyGroupsPassed(T2,R2));	
		
		System.out.println("*********");
		
		String[] R3= {"Wrong answer", "OK", "OK", "OK", "OK","OK","OK","OK","Runtime error"};
		String[] T3= {"codility1", "codility3", "codility2", "codility4b", "codility4a", "test1a", "test1b","test1c", "Test2"}; 
		System.out.println(findHowManyGroupsPassed(T3,R3));	
		
	}
	
	
	private static long noOfGroups (String[] T) {
	return Arrays.asList(T).stream()
				.map(i -> StringUtils.stripEnd(i, STRIP_STRING))
				.distinct()
				.count();		
	}
	
	
	private static int findHowManyGroupsPassed(String[] T, String[] R) {
		if(T.length != R.length) { return 0;}
		
		AtomicInteger count = new AtomicInteger(0);
		Map<String, String> newHash = new HashMap<>();
		Arrays.asList(R).stream()
				.forEach(r -> {
					newHash.put(T[count.get()], r);
					count.getAndIncrement();
				});
// old type		
//		int finalPassedListOfGroup = 0;
		AtomicInteger finalPassedListOfGroup = new AtomicInteger(0);
		List<String> doneTest = new ArrayList<>();
		for(int i=0; i < T.length; i++) {
			if(!doneTest.contains(T[i])) {
				String groupName = StringUtils.stripEnd(T[i], STRIP_STRING);
				List<String> groups = Arrays.asList(T).stream()
						.filter(t -> t.startsWith(groupName))
						.collect(Collectors.toList());
// old type				
//				int passedInGroups = 0;
//				for(String group : groups) {
//					if(newHash.get(group).equals("OK")) 
//						passedInGroups++;
//					doneTest.add(group);
//					if(passedInGroups == groups.size())
//						finalPassedListOfGroup++;
//				}
				
				AtomicInteger passedInGroups = new AtomicInteger(0);
				groups.stream().forEach(g -> {
					if(newHash.get(g).equals("OK")) {
						passedInGroups.getAndIncrement();
					}
					doneTest.add(g);
					if(passedInGroups.get() == groups.size())
						finalPassedListOfGroup.getAndIncrement();
				});
				
				
			}
		}
		
		long result = finalPassedListOfGroup.get() * 100 / noOfGroups(T);		
		System.out.println("Result is : "+ (int) result);		
		return (int) result;
	}
	
	
}



