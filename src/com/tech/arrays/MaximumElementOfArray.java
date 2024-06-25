package com.tech.arrays;

import java.util.Arrays;

public class MaximumElementOfArray {
	public static void main(String[] args) {
		
		System.out.println(Arrays.stream(InputUtil.readArray()).max().getAsInt());
	}
}
