package com.tech.arrays;

import java.util.Arrays;

//Write a Java program to find the second smallest element in an array.

public class SecondSmallestNumber {
	public static void main(String[] args) {
		int[] numbers = {1,4,8,5,9,10,4,2,7,9};
		
		int sortedArray[]=Arrays.stream(numbers).sorted().toArray();
		
		if (sortedArray.length<2 || numbers.length==0) {
			throw new IllegalArgumentException("Array must contain at least two elements.......!!!!!");
		}
		else{
			System.out.println(sortedArray[1]);
		}
	}
}
