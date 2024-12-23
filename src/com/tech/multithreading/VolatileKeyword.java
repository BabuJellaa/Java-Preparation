package com.tech.multithreading;

public class VolatileKeyword {
	public static int number=0;

	static class FirstThread extends Thread {
		@Override
		public void run() {
			System.out.println("1st Number value : "+number);
			int localValue=number;
			System.out.println("1st local value : "+localValue);

			while(localValue<5) {
				//localValue++;
				System.out.println("After increment localValue value : "+localValue);
				number=++localValue;
				System.out.println("Number value from first thread "+(number));
				try {
					Thread.sleep(500);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	static class SecondThread extends Thread {
		public void run() {
			System.out.println("2nd Number value : "+number);
			int localValue=number;
			while(localValue < 5) {
				if(localValue != number) {
					System.out.println("Number value from second thread : " + (number));
					localValue = number;
				}
			}
		}
	}

	public static void main(String[] args) {
		new FirstThread().start();
		new SecondThread().start();
	}
}
