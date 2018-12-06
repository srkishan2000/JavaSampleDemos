package com.shan.zalando;

import java.util.concurrent.TimeUnit;

public class FillABInAString {

	static StringBuffer str;
	
	public static String solution(int A, int B) throws InterruptedException {
		MainThread thread1 = new MainThread("a", A);
		thread1.start();
		MainThread thread2 = new MainThread("b", B);
		thread2.start();

		TimeUnit.SECONDS.sleep(2);
		
		return str.toString();
	}

	public static void main(String[] args) throws InterruptedException {
		 System.out.println("solution(10, 8) : " + solution(10, 8));
		 
		 System.out.println("solution(5, 5) : " + solution(5, 5));
		 
		 System.out.println("solution(100, 0) : " + solution(100, 0));
		 
		 System.out.println("solution(0, 25) : " + solution(0, 25));
		 
		 System.out.println("solution(5, 30) : " + solution(5, 30));
		 
	}

	// Thread class
	static class MainThread implements Runnable {
		Thread mainThread;
		private String threadName;
		private int maxLimit;
		
		MainThread(String name, int limit) {
			threadName = name;
			maxLimit = limit;
		}

		@Override
		public synchronized void run() {
			//System.out.println("Thread running " + threadName);
			for (int i = 0; i < maxLimit; i++) {
				//System.out.println(i);
				//System.out.println(threadName);
				str.append(threadName);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					System.out.println("Thread has been interrupted");
				}
			}
		}

		public void start() {
			//System.out.println("Thread started");
			str = new StringBuffer();
			if (mainThread == null) {
				mainThread = new Thread(this, threadName);
				mainThread.start();
			}

		}
	}

}
