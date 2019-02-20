package com.shan.sample.repeatedstring;


public class RepeatedString {
	
	static long repeatedString(String s, long n) {
		long result;
        long count = s.chars().filter(ch -> ch =='a').count();
        long noOfTimes = n/s.length();
        result = count * noOfTimes;
        
        if (n % s.length() > 0) {
            int endIndex = (int) (n % s.length());
            result += s.substring(0, endIndex).chars().filter(ch -> ch =='a').count();
        }
        return result;
	}

	public static void main(String[] args) {
		// abc
		// 5
		String s = "abc";
		long n = 5l;
		System.out.println(repeatedString(s, n));
		// Expected 2
		
		System.out.println("*********************");
		
		// aba
		// 5
		s = "aba";
		System.out.println(repeatedString(s, n));
		// Expected 3

		System.out.println("*********************");
		
		// abcdefghijkl
		// 5
		s = "ijkl";
		System.out.println(repeatedString(s, n));
		// Expected 0
		

	}

}
