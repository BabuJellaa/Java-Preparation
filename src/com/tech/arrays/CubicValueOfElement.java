package com.tech.arrays;

import java.util.Arrays;

// Write a program to array elements to print cubic values

public class CubicValueOfElement {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(Arrays.stream(InputUtil.readArray()).map(number -> number*number*number).toArray()));
	}
}
