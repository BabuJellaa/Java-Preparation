package com.tech.tricky;

import java.util.Scanner;

/*Arun is a bus conductor. His ticket machine is printing numbers in reverse order due to a technical glitch. 
As a programmer on the bus, you are asked to help him by creating a program to display the numbers correctly.

Example: Input: 320
Output: Number in reverse order: 23

Input: 231
Output: Number in reverse order: 132*/

public class BusConductorExample {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter number :");
		int number=scanner.nextInt();
		
		
		System.out.println(Integer.parseInt(new StringBuilder(Integer.toString(number)).reverse().toString()));
	}
}
