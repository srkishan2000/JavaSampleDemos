package com.shan.sample.largestprime;

public class LargestPrime {
	
	public static int getLargestPrime(int number) {
        if(number > 1){
            int i;
            for (i = 2; i <= number; i++) {
            	System.out.println("i >> : " + i);
                if (number % i == 0){
                    number /= i;
                    System.out.println("i : " + i);
                    i--;
                    System.out.println("i - : " + i);
                }
            }
            return i;
        }
        return -1;
    }
		
	public static void main(String[] args) {
		System.out.println(getLargestPrime(21));
		System.out.println("****");
		System.out.println(getLargestPrime(217));
		System.out.println("****");
		System.out.println(getLargestPrime(1));
	}

}
