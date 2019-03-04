package com.shan.sample.iteration;

public class BinaryGap {
	
	static int solution(int n) {
	    return solution(n, 0, 0);
	}

	static int solution(int n, int max, int current) {
	    if (n == 0)
	        return max;
	    else if (n % 2 == 0)
	        return solution(n / 2, max, current + 1);
	    else
	        return solution(n / 2, Math.max(max, current), 0);
	}
	
	public static void main(String[] args) {
		int[] tests = { 9, 37, 0b100100001010001, 5, 13};
		for (int i : tests)
		    System.out.printf("input = %d, Binary form = %s, Answer = %d%n",
		        i , Integer.toBinaryString(i), solution(i));
	}
}