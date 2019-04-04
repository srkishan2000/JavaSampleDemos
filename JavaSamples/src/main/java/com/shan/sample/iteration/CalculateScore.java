package com.shan.sample.iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculateScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"OK", "Wrong answer", "Time limit exceeded", "Runtime error"
		
		
		
		String[] R= {"Wrong answer", "OK", "OK", "Runtime error", "OK"};
		String[] T= {"codility1", "codility3", "codility2", "codility4b", "codility4a"}; 
		
		System.out.println(findHowManyGroupsPassed(T,R));		
	
		System.out.println("*********");
		
		String[] R1= {"Wrong answer", "OK", "Runtime error", "OK", "Time limit exceeded"};
		String[] T1= {"test1a", "test2", "test1b", "test1c", "test3"};
		
		System.out.println("*********");
			
		String[] R2= {"Wrong answer", "OK", "OK", "OK", "OK"};
		String[] T2= {"codility1", "codility3", "codility2", "codility4b", "codility4a"}; 
		System.out.println("*********");
		System.out.println(findHowManyGroupsPassed(T2,R2));		
				
		//int noOfGroups = findNoOfgroups(T);
		findHowManyGroupsPassed(T1,R1);
		    
	}
	
	private static int findNoOfgroups (String[] T) {
		//int noOfGroups = 0;
		//String groupName = "";
		List<String> categories = new ArrayList<>();
		for(int i = 0; i < T.length ; i++) {
			String[] grpName = T[i].split("(?<=[0-9])(?=[a-zA-Z])");
			
	    		//System.out.println(">>>>"+grpName[0]);
	    		//System.out.println(categories.contains(grpName[0].toString()));
	    		
	    		if(!categories.contains(grpName[0])) {
	    			categories.add(grpName[0]);
	    		}
	    	}
			
		System.out.println("###########   categories.size :  "+categories.size() + " , " + categories);
		
		return categories.size();
	}
	
	private static int findHowManyGroupsPassed(String[] T, String[] R) {
		if(T.length != R.length) { return 0;}
		
		List<String> finalPassedList = new ArrayList<>();
		List<String> manyGroup = new ArrayList<>();
		List<String> singleGroup = new ArrayList<>();
		List<String> passedCategories = new ArrayList<>();
		int count = 0;
		
		for (int i = 0; i < R.length; i++) {
			String[] grpName = T[i].split("(?<=[0-9])(?=[a-zA-Z])");
			
			if(grpName.length > 1 && grpName[1] != null && !grpName[1].isEmpty()) {
				if(!manyGroup.contains(T[i])) {
					manyGroup.add(T[i]);
		    		}
	    		} else {
	    			if(!singleGroup.contains(grpName[0])) {
	    				singleGroup.add(grpName[0]);
	    	    		}
	    		}
			
			if(R[i].equals("OK")) {
//				if(singleGroup.contains(grpName))
		
				System.out.println(T[i]+"-"+R[i]);
				passedCategories.add(T[i]);
				count++;
			} else {
				count++;
			} 
		}
		
		
		System.out.println("###########  singleGroup.size  :  "+singleGroup.size() + " , " + singleGroup);
		System.out.println("###########  manyGroup.size :  "+manyGroup.size() + " , " + manyGroup);
		System.out.println("###########  passedCategories.size :  "+passedCategories.size() + " , " + passedCategories);
		System.out.println("XXXX "+count);
		
		List<String> noOfPassedSingleGroups = new ArrayList<>();
		List<String> noOfPassedManyGroups = new ArrayList<>();
		
		for(String str: passedCategories) {
			String[] grpName = str.split("(?<=[0-9])(?=[a-zA-Z])");
			
			if(grpName.length > 1 && grpName[1] != null && !grpName[1].isEmpty()) {
				
				if(manyGroup.contains(grpName[0]+grpName[1])) {
					noOfPassedManyGroups.add(grpName[0]+grpName[1]);
					
				}
				
			} else {
				if(singleGroup.contains(grpName[0])) {
					noOfPassedSingleGroups.add(grpName[0]);
					finalPassedList.add(grpName[0]);
				}
			}
		}
		
		
		
		// Verify Many group is passed or not
		//int passedManyGroup = 0;
	
				
		
		for (String passed : passedCategories) {
			String[] passeGrpName = passed.split("(?<=[0-9])(?=[a-zA-Z])");
			if(passeGrpName.length > 1 && passeGrpName[1] != null && !passeGrpName[1].isEmpty()) {
				
				List<String> filteredManyGroups = manyGroup.stream().filter(i -> i.contains(passeGrpName[0])).collect(Collectors.toList());
		        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA  "+filteredManyGroups);
				
		        List<String> filteredPassedGroups = passedCategories.stream().filter(i -> i.contains(passeGrpName[0])).collect(Collectors.toList());
		        System.out.println("BBBB BBBBBBBBBBBBBBBBBBBBBBBBBBB  "+filteredPassedGroups);
				
		        if(filteredManyGroups.equals(filteredPassedGroups) && !finalPassedList.contains(passeGrpName[0])) {
		        		finalPassedList.add(passeGrpName[0]);
		        }
				
				
			}
			
		}
			
		System.out.println("OOOOOOOOOOOOOOOOOOO finalPassedList : "+finalPassedList.size() +", "+finalPassedList);
		System.out.println("###########  noOfPassedSingleGroups   :  "+noOfPassedSingleGroups.size() + " , " + noOfPassedSingleGroups);
		System.out.println("###########  noOfPassedManyGroups  :  "+noOfPassedManyGroups.size() + " , " + noOfPassedManyGroups);
		
		
		int result = finalPassedList.size() * 100 / findNoOfgroups(T);
		
		System.out.println("Result is : "+ result);
		
		return result;
	}
	
	

}
