package com.tech.arrays;

import java.util.stream.IntStream;

public class FindMissingNumber {
	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,8,9};
		int length = numbers.length+1;
		
		int missingNumber= IntStream.rangeClosed(1, length).sum() - IntStream.of(numbers).sum();
		
		System.out.println(missingNumber);
	}
}
