package com.tech.tuesday;

import java.util.Scanner;


/*
		Given an integer, n  perform the following conditional actions:

		If n is odd, print Weird
		If n is even and in the range of  2 to 5 , print Not Weird
		If n is even and in the range of 6 to 20 , print Weird
		If n is even and greater than 20, print Not Weird

 */

public class WeiredClassification {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = scanner.nextInt();
		scanner.close();
		
		if (n % 2 != 0) {
			System.out.println("Weird");
		}
		else {

			if (n >= 2 && n <= 5) {

				System.out.println("Not Weird");

			} else if (n >= 6 && n <= 20) {

				System.out.println("Weird");

			} else {

				System.out.println("Not Weird");
			}
		}
		scanner.close();
	}
}



