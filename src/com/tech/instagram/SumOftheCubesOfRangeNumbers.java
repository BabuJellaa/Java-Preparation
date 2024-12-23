package com.tech.instagram;

import java.util.Scanner;

public class SumOftheCubesOfRangeNumbers {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int number1 = scanner.nextInt();
		System.out.println("Enter 2nd number : ");
		int number2 = scanner.nextInt();
		
		int sum=0;
		for(int range=number1;range<=number2;range++) {
			sum+=range*range*range;
		}
		
		System.out.println("Sum of the cubes of the numbers in range from "+number1+" to "+number2+" is "+sum);
		scanner.close();
	}
}
