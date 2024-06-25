package com.tech.arrays;

import java.util.Arrays;

/*Write a program to array elements to print sum of Negative Numbers 

Array = {10, -23, 45, -10, 30}
Sum of Negative Array Elements = -33*/

public class SumOfNegativeNumbers {
	public static void main(String[] args) {
		System.out.println(Arrays.stream(InputUtil.readArray()).filter(number-> number<0).sum());
	}
}
