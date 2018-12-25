package com.shan.sample.series;

public class Series {
	
	public static long sum(int n) {
	
		 if (n<0) {            
            return -1;
        } else if (n==0) {
            return 0;
        } else  {
            //return n + sum(n-1);
        	System.out.println(" n + sum(n-1)  value is : " + n + sum(n-1));
        	
        	System.out.println(" n * (n+1) / 2 value is : " + n * (n+1) / 2);
        }
		
		return (n * (n+1) / 2);
	} 
	
	public static long factorial(int n) {
		if (n == 0) {
			return 1;
		}
		
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	public static long fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n==1) {
			return 1;
		}
		
		long nMinus1 = 1;
		long nMinus2 = 0;
		long fib = 0;
		
		for (int i = 1; i < n; i++) {
			fib  = (nMinus2 + nMinus1);
			nMinus2 = nMinus1;
			nMinus1 = fib;
		}
		return fib;
	}
	
	public static int fibonacci_1(int n) {
		int result = 0;
		if(n <= 1) {
			result = n;
		} else {
			result = fibonacci_1(n-1) + fibonacci_1(n-2);
		}
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(4)); // 1+2+3+4 = 10
		System.out.println("*********"); 
		
		System.out.println(factorial(5)); // 5! = 5*4*3*2*1 = 120 
		System.out.println("*********");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(fibonacci(i));// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 
		}
		System.out.println("*********");
		
		for (int i = 1; i <= 15; i++) {
			System.out.println(fibonacci_1(i));// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
		} 
		System.out.println("*********");

	}

}
