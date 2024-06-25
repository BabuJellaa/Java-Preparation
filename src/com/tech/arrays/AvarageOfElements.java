package com.tech.arrays;

import java.util.Arrays;


/*Write a Java program to calculate the average value of array elements.*/

public class AvarageOfElements {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,8,9};
		
		System.out.println(Arrays.stream(numbers).sum()/numbers.length);
	}
}
