package com.tech.arrays;

import java.util.Arrays;

//Write a program to print sum values of an array

public class SumOfElements {
	public static void main(String[] args) {
		
		System.out.println("Sum of the all elements in the array is :"+ Arrays.stream(InputUtil.readArray()).sum());
	}
}
