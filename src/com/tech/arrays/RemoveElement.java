package com.tech.arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Write a Java program to remove a specific element from an array.

public class RemoveElement {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,9,9,4,5,6,8,9};

		int numberToBeRemove=9;

		List<Integer> integers=new LinkedList<Integer>();
		for(int element=0; element<numbers.length;element++) {
			if(numbers[element]!=numberToBeRemove) {
				integers.add(numbers[element]);
			}
		}
		System.out.println(Arrays.toString(integers.toArray()));
	}
}
