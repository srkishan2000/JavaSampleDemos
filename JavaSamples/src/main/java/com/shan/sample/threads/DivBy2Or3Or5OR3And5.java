package com.shan.sample.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// DivBy2Or3Or5OR3And5 between 1 to 100

public class DivBy2Or3Or5OR3And5{
	
	public static final int MIN = 1;
	public static final int MAX = 100;
		
	public static void main (String args[]) {
		
		int[] divisor2 = {2};
		Thread t1 = new DivThread("Div by 2", divisor2);
		t1.start();
		
		int[] divisor3 = {3};
		Thread t2 = new DivThread("Div by 3", divisor3);
		t2.start();
		
		int[] divisor5 = {5};
		Thread t3 = new DivThread("Div by 5", divisor5);
		t3.start();
		
		int[] divisor3and5 = {3,5};
		Thread t4 = new DivThread("Div by 3 and 5", divisor3and5);
		t4.start();
		
		int[] divisor2and5and10 = {2,5,10};
		Thread t5 = new DivThread("Div by 2 and 5 and 10", divisor2and5and10);
		t5.start();
		
	}
	
	public static class DivThread extends Thread {
		private String name;
		private int[] divisor;
		private List<Integer> list =  new ArrayList<>(); 
		
		public DivThread(String name) {
			this.name = name;
		}
		
		public DivThread(String name, int[] divisor) {
			this.name = name;
			this.divisor = divisor;
			
		}
		
		@Override
		public void run() {
			// Range between MIN to MAX including
			for (int i = MIN; i <= MAX; i++) {

				int counter = 0;
				for (int j = 0; j < divisor.length; j++) {
					int k = divisor[j];
					 if ((i % k == 0)) {
						 counter ++;
					 }
				}
				
				if (divisor.length == counter) {
//				System.out.println( this.name + " : " + i );
				list.add(i);
				}
			}
			
			System.out.println(this.name + " has number of results " + list.size() + " : " + Arrays.toString(list.toArray()));	
		}
		
	}

}


