package com.tech.arrays;

import java.util.Arrays;

public class SortingElements {
	public static void main(String[] args) {
		
		int sortedArray[]=Arrays.stream(InputUtil.readArray()).sorted().toArray();
		
		System.out.println(Arrays.toString(sortedArray));
	}
}
