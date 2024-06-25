package com.tech.arrays;

import java.util.Arrays;

//Write a program to array elements to print sum of Even Numbers

public class SumOfEvenElements {
	public static void main(String[] args) {
		System.out.println(Arrays.stream(InputUtil.readArray()).filter(number -> number%2==0).sum());
	}
}
