package com.shan.sample.list;

import java.util.ArrayList;
import java.util.List;

public class Print1To100DivisibleBy3And5AndBoth {

	public static void main(String[] args) {
		List<Integer> divisibleBy3 = new ArrayList<>();
		List<Integer> divisibleBy5 = new ArrayList<>();
	    List<Integer> divisibleBy3and5 = new ArrayList<>();
	    
	    for (int i = 1; i <= 100; i++) {
	      if (i % 3 == 0) {
	        divisibleBy3.add(i);
	      }
	      if (i % 5 == 0) {
	        divisibleBy5.add(i);
	      }
	      if ((i % 3 == 0) && (i % 5 == 0)) {
	        divisibleBy3and5.add(i);
	      }
	    }
	    
	    System.out.format("Divisible by 3:%n%s%n%n"
	        + "Divisible by 5:%n%s%n%n"
	        + "Divisible by 3 and 5:%n%s%n",
	        divisibleBy3,
	        divisibleBy5,
	        divisibleBy3and5);
	 }
	
}
