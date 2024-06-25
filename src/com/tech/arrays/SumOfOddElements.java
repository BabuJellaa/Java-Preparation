package com.tech.arrays;

import java.util.Arrays;

// Write a program to array elements to print sum of Odd Numbers

public class SumOfOddElements {
	public static void main(String[] args) {
		Arrays.stream( InputUtil.readArray()).filter(number -> number%2!=0).sum();
	}
}
