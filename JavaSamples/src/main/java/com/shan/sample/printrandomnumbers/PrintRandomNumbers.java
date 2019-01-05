package com.shan.sample.printrandomnumbers;

import java.util.Random;
import java.util.function.Supplier;

public class PrintRandomNumbers {
	
	private static final int LIMIT_RANGE = 100;

	public static void main(String[] args) {
		
		Random random = new Random();
		// print 10 numbers in the LIMIT_RANGE
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(LIMIT_RANGE));
		}
		
		
		Supplier<Integer> randomSupplier = () -> random.nextInt(LIMIT_RANGE);	
		for (int i = 0; i < 10; i++) {
			System.out.println(">>> : " + randomSupplier.get());
		}

	}

}
