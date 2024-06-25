package com.tech.wednesday;

import java.util.Scanner;

/*     Write a java programm of take input of 5 numbers find their sum and Average    */


public class SumAndAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the count of number that you want to perform sum and Average :");
		int size=scanner.nextInt();

		System.out.println("Enter "+size+" numbers :");
		int sum = 0;
		for (int i = 0; i < size; i++) {
			int number = scanner.nextInt();
			sum += number;
		}

		double average = (double) sum / 5;

		System.out.println("Sum of the five numbers: " + sum);
		System.out.println("Average of the five numbers: " + average);

		scanner.close();
	}
}
