package com.shan.sample.factorofnumbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FactorOfNumbers {
	
	static int minimum (int a, int b) {
        return  a <= b ? a : b;
    }
	
	static List<Integer> commonDivisor (int a, int b) {
        List<Integer> list = new ArrayList<>();

        int min = minimum(a, b);
        for (int i=1; i <= min/2; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                list.add(i);
            }
        }

        if((a % min == 0) && (b % min == 0)) {
            list.add(min);
        }

        return list;
    }
	
	
	static List<Integer> commonDivisor (int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        
	
        return list;
    }
    
	
	private static int gcdThing(int a, int b) {
	    BigInteger b1 = BigInteger.valueOf(a);
	    BigInteger b2 = BigInteger.valueOf(b);
	    BigInteger gcd = b1.gcd(b2);
	    return gcd.intValue();
	}
	
	
    static void commonDivisor (int[] a, int[] b) {
    	
    	
    	
    	
    	
    	
    	
    	/*List<Integer> list = new ArrayList<>();
    	int min = Arrays.stream(b)
      	      .min()
      	      .getAsInt();
    	

        for (int i=0; i<a.length; i++) {
        	for (int j=2; j<=(a.length * b.length); j+=2) {
        		int num = a[i] * j;
                if(!list.contains(num) && num <= min)
                	list.add(num);
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
    	
    	int index=0;
    	int result = 0;
        
    	while(index < list.size()) {
    		int bDivCount = 0;
    		for(int i = 0; i < b.length; i++) {
    			if (b[i] % list.get(index) == 0) {
    				bDivCount++;
    			}
    			if(bDivCount == b.length)
    				result++;
    		}
    		index++;
    	}
        
        System.out.println(result);*/
        
    	
    	/*
    	
    	
        List<Integer> list = new ArrayList<>();

        int min = Arrays.stream(b)
        	      .min()
        	      .getAsInt();
        
        int max = Arrays.stream(a)
      	      .max()
      	      .getAsInt();
        
        	for (int i=1; i <= min/2; i++) {
                int count = 0;
                for (int arrElement : b) {
	        		if ((arrElement % i == 0) && (i >= max) ) {
	                    count++;
	                }
	        		if ((count == b.length)) {
	        			list.add(i);
	        		}
                }
            }
        	
        System.out.println(Arrays.toString(list.toArray()));
            	
        
        int result = 0;
        	
        for (int ar : a) {
        	int countA= 0;
        	for (Integer alist : list) {
        		if (alist % ar == 0)
        			countA++;
        		if (countA == list.size()) {
        			result++;
        		}
        	}
        	
        }
        
        System.out.println("<<< "+ result);
        
        List<Integer> listWithoutDuplicates = list.stream()
        	     .distinct()
        	     .collect(Collectors.toList());
        
        
        System.out.println(Arrays.toString(listWithoutDuplicates.toArray()));
        
        
        int result1 = 0;
        for (int arrElement : a) {
        	int count = 0;
        	for (Integer div : listWithoutDuplicates) {
        		if(div % arrElement == 0) {
        			count++;
        		}
        	}
        	if (count == listWithoutDuplicates.size()) {
        		result1++;
        	}
        }
        
        
        
        
       
        return result;
        */
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(Arrays.toString(commonDivisor(24, 36).toArray()));
		
//		System.out.println(Arrays.toString(commonDivisor(16, 32).toArray()));
		
		int[] a = {2,4};
		int[] b = {16,32,96};
//		List<Integer> l = commonDivisor(a,b);
//		Collections.sort(l);
//		System.out.println(Arrays.toString(l.toArray()));
		commonDivisor(a,b) ;
		
		System.out.println(gcdThing(16, 40));
		

	}

}
