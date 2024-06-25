package com.tech.arrays;

import java.util.Arrays;

//Write a program to array elements to print sum of Cubic Values

public class CubicValuesSum {
	public static void main(String[] args) {
		System.out.println(Arrays.stream(InputUtil.readArray()).map(number -> number*number*number).sum());
	}
}
