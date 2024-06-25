package com.tech.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

//Write a Java program to find duplicate values in an array of integer values.

public class DuplicateElementsOfArray {
	public static void main(String[] args) {
		Integer[] numbers = {1,2,3,9,9,4,5,6,8,9};
		
		List<Integer> list=Arrays.asList(numbers);
		
		LinkedHashSet<Integer> removeDuplicate=new LinkedHashSet<Integer>(list);
		
		System.out.println(Arrays.toString(new ArrayList<Integer>(removeDuplicate).toArray()));
	}
}
