package com.shan.sample.printrandomnumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class PrintRandomNumbers {
	
	private static final int LIMIT_RANGE = 101;

	public static void main(String[] args) {
		
		Random random = new Random();
		// print 10 numbers in the LIMIT_RANGE
		for (int i = 0; i < 10; i++) {
			System.out.println(random.nextInt(LIMIT_RANGE));
		}
		
		
		Supplier<Integer> randomSupplier = () -> random.nextInt(LIMIT_RANGE);	
		for (int i = 0; i < 10; i++) {
			System.out.println("using LAMBDA >>> : " + randomSupplier.get());
		}
		
		
		//random numbers are added between 1 to 100 in the list but not to have duplicate number and zero.
		// if Limit range and loop range are same then it take long time to finish...  better to have more than one in the limit range than the loop range to process better.
		List<Integer> randomNumberList = new ArrayList<>();
		
		while(true) {
			if(randomNumberList.size() == 100) {
				break;
			} else {
				Integer randomNumber = random.nextInt(LIMIT_RANGE);
				if ((!randomNumberList.contains(randomNumber)) && randomNumber != 0) {
					randomNumberList.add(randomNumber);
				}
			}
		}
		
		System.out.println("list unorder" + Arrays.toString(randomNumberList.toArray()));
		
		Collections.sort(randomNumberList);
		
		System.out.println("list ordered" + Arrays.toString(randomNumberList.toArray()));

	}

}
