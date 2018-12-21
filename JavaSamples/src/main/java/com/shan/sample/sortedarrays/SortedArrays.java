package com.shan.sample.sortedarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortedArrays {
	
	
	/*
	 * 
	 * References
	 * ----------
	 * 
	 * Java 8 Comparator – How to sort a List - very good samples of sorting
	 * https://reversecoding.net/java-8-comparator-how-to-sort-a-list/
	 * 
	 * ========================================================================
	 * 
	 * Java 8 Lambda Comparator example for Sorting List of Custom Objects
	 * https://beginnersbook.com/2017/10/java-8-lambda-comparator-example-for-sorting-list-of-custom-objects/
	 * 
	 * ========================================================================
	 * 
	 */
	

	public static void main(String[] args) {
		int[] intArray = {10,6,2,8,4,1};
		
		// first way to sort an array
		int[] sorted = IntStream.of(intArray)
		        .boxed()
		        //.sorted(Comparator.reverseOrder())  // Descending order
		        .sorted(Comparator.naturalOrder())  // Ascending order
		        .mapToInt(i -> i)
		        .toArray();
		
		for (int j : sorted) {
			System.out.println(j);
		}

		// second way to sort an array
		Arrays.sort(intArray);
		
		for (int j : intArray) {
			System.out.println(j);
		}
		
		
		/*
		 *  String arrays sorting by length of a word
		 */
		
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

	    System.out.println(Arrays.toString(months));
	    // String arrays sorting by length of a word using lambda
	    Arrays.sort(months, Comparator.comparingInt(String::length));
	    
	    System.out.println(Arrays.toString(months));
	    
	    
	    /*
		 * The console output is shown here. Notice after the first sort of the array and the first sort of the collection, 
		 * the results have been alphabetized but case matters (uppercase words come before lowercase words). 
		 * Notice that after the second sort of the array and the second sort of the collections, 
		 * the results have been alphabetized without regards to case.
		 */
	    
	    String[] months_1 = {"January","February","March","April","May","June","July","August","September","October","November","December"};

	    // another way of samples
	    System.out.println("-------aaa-------");
		displayArray(months_1); // January February March April May June July August September October November December 

		System.out.println("-------aaa-------");
		Arrays.sort(months_1);
		displayArray(months_1); // April August December February January July June March May November October September

		System.out.println("-------aaa-------");
		Arrays.sort(months_1, String.CASE_INSENSITIVE_ORDER);
		displayArray(months_1); // April August December February January July June March May November October September
 
		System.out.println("-------aaa-------");

		
		// arrays to list and sorting.
		
		String[] months_2 = {"January","February","March","April","May","June","July","August","September","October","November","December"};

		List<String> strList = Arrays.asList(months_2);
		System.out.println("------bbb--------");
		displayList(strList); // January February March April May June July August September October November December
		
		System.out.println("-------bbb-------");
		Collections.sort(strList);
		displayList(strList); // April August December February January July June March May November October September 
		
		System.out.println("-------bbb-------");
		Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
		displayList(strList); // April August December February January July June March May November October September
	
		
		
		
		/*
		 * The console output is shown here. Notice after the first sort of the array and the first sort of the collection, 
		 * the results have been alphabetized but case matters (uppercase words come before lowercase words). 
		 * Notice that after the second sort of the array and the second sort of the collections, 
		 * the results have been alphabetized without regards to case.
		 */
		
		String[] strArray = { "Carol", "bob", "Alice" };
		System.out.println("------111------");
		
		displayArray(strArray); // Carol bob Alice 

		System.out.println("------111------");
		
		Arrays.sort(strArray);
		displayArray(strArray); // Alice Carol bob 

		System.out.println("------111------");
		
		Arrays.sort(strArray, String.CASE_INSENSITIVE_ORDER); 
		displayArray(strArray); // Alice bob Carol

		System.out.println("------111------");

		List<String> strList1 = new ArrayList<String>();
		strList1.add("larry");
		strList1.add("Moe");
		strList1.add("Curly");
		System.out.println("------222------");
		
		displayList(strList1); // larry Moe Curly

		System.out.println("------222-------");
		
		Collections.sort(strList1);
		displayList(strList1); // Curly Moe larry

		System.out.println("------222------");
		
		Collections.sort(strList1, String.CASE_INSENSITIVE_ORDER);
		displayList(strList1); // Curly larry Moe 
		
    
	}
	
	public static void displayArray(String[] array) {
		for (String str : array) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

	public static void displayList(List<String> list) {
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}
