package com.tech.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class GetNegPosnumbers {
	public static void main(String[] args) {
		int[] numbers = {1, -2, 3, -4, 5, -6, -7, 8, 9};
		
		numbers = IntStream.concat(Arrays.stream(numbers).filter(element-> element<0), Arrays.stream(numbers).filter(element -> element>0)).toArray();
		
		System.out.println(Arrays.toString(numbers));
	}
}
