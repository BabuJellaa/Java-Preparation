package com.tech.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/*Write a program to Print Unique Elements in Array
Sample Output
Array = {10, 20, 40, 20, 10}
Display Array Unique Elements = {10, 20, 40 }*/

public class UniqueValuesArray {
	public static void main(String[] args) {
		
		Integer[] array= {10, 20, 40, 20, 10};
		
		System.out.println(Arrays.toString(new ArrayList<Integer>(new LinkedHashSet<Integer>(Arrays.asList(array))).toArray()));
		
	}
}
