package com.tech.wednesday;

import java.util.Scanner;



/*	Write a java programm to print even and odd numbers and their respective sum 
	  take inputs from user..    */


public class EvenOddSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the count of number  :");
		int size=scanner.nextInt();

		System.out.println("Enter "+size+" numbers :");

		int[] numbers=new int[size];

		int oddSum=0;
		int evenSum=0;

		for(int i=0;i<size;i++) {
			numbers[i]=scanner.nextInt();
		}

		for(int num : numbers) {
			if(num%2==0) {
				evenSum+=num;
			}
			else {
				oddSum+=num;
			}
		}

		System.out.println("Odd numbers..");
		for(int num : numbers) {
			if(num%2!=0) {
				System.out.print(num+" , ");
			}
		}
		System.out.println("Sum of the odd numbers : "+oddSum);

		System.out.println("Even numbers..");
		for(int num : numbers) {
			if(num%2==0) {
				System.out.print(num+" , ");
			}
		}
		System.out.println("Sum of the even numbers : "+evenSum);
		scanner.close();
	}

}
