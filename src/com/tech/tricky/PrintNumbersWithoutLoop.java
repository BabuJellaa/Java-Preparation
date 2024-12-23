package com.tech.tricky;

/*Print 1 to 100 numbers without using loops*/

public class PrintNumbersWithoutLoop {
	public static void printNumbers(int number) {
		if(number<=100) {
			System.out.println(number);
			printNumbers(number+1);
		}
	}
	public static void main(String[] args) {
		printNumbers(6);
	}
}
