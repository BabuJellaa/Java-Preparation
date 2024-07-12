package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to insert an element into the array list at the first position.*/

public class InsertingElementAtPortion {
	public static void main(String[] args) {
		List<Integer> numbers= new ArrayList<Integer>();
		Collections.addAll(numbers, 1,2,3,4,6,7,8,9);
		
		System.out.println(numbers);
		
		numbers.add(4, 5);
		
		System.out.println(numbers);
	}
}
