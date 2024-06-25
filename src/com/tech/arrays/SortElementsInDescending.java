package com.tech.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

//Write a program to Sort Numeric Array In Descending Order

public class SortElementsInDescending {
	public static void main(String[] args) {
		
		int[] sortedArray=IntStream.of(InputUtil.readArray()).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		
		System.out.println("Descending order of elements in array :" + Arrays.toString(sortedArray));
	}
}
