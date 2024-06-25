package com.tech.saturday;

public class NaturalNumbers {

	public static void main(String[] args) {

		System.out.println("First 10 natural numbers :");

		int sum=0;

		for(int i=1;i<=10;i++) {
			System.out.println(" "+i);
		}

		for(int i=0;i<=10;i++) {
			sum=sum+i;
		}
		System.out.println();
		System.out.println("Sum of the 10 natural numbers : "+sum);

	}

}
