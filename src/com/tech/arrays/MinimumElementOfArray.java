package com.tech.arrays;

import java.util.Arrays;

public class MinimumElementOfArray {
	public static void main(String[] args) {
		
		System.out.println(Arrays.stream(InputUtil.readArray()).min().getAsInt());
	}
}
