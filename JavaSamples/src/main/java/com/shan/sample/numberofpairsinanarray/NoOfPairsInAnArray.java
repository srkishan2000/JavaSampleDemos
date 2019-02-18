package com.shan.sample.numberofpairsinanarray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoOfPairsInAnArray {
	
	public static int sockMerchant(int n, int[] ar) {
		
		  if ( n < 1 && n > 100) {
			  return 0; 
		  }
		  
		  List<Integer> arList = Arrays.stream(ar).boxed().collect(Collectors.toList());
		  
		  List<Integer> identicalList = arList.stream().distinct().collect(Collectors.toList()); 
		  
		  int count = 0;
		  
		  for (Integer integer : identicalList) { 
			  long numMatches = arList.stream().filter(e -> e.equals(integer)) .count();
		  
			  if (numMatches % 2 != 0) { 
				  count += (numMatches - 1); 
			  } else {
				  count += numMatches; 
			  }
		  
		  }
		 
        return count / 2;  // returning no of Pairs.

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 2};
		
		System.out.println(sockMerchant(9, ar));
	}

}
