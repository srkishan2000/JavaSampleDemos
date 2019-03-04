package com.shan.sample.iteration;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BinaryNumbers {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
        String bin[] = Integer.toBinaryString(n).split("0");
        
        // Using Stream to find the max word of an array - to Solve
        System.out.println("%%% : " + findMaxLengthWordOfAnArrayUsingStream(bin));
        
       
        // this is a second options way to Solve
        System.out.println(">>> : " + Arrays.toString(bin));
        
        Arrays.sort(bin);
        
        System.out.println("### : " + Arrays.toString(bin));
        
        System.out.println(bin[bin.length-1].length());
        
        
        scanner.close();
	}
	
	private static int findMaxLengthWordOfAnArrayUsingStream(String[] bin) {
//		return (Arrays.stream(bin).max(Comparator.comparingInt(String::length))).toString().length();
		return Arrays.stream(bin).max(Comparator.comparingInt(String::length)).get().length();
	}

}
