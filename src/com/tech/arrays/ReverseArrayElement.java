package com.tech.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Write a Java program to reverse an array of integer values.

public class ReverseArrayElement {
	public static void main(String[] args) {
		Integer numbers[] = {1,2,3,4,5,6,8,9};
		
		List<Integer> newList = Arrays.asList(numbers);
		
		Collections.reverse(newList);
		
		Integer[] reverArray= newList.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(reverArray));
	}
}
