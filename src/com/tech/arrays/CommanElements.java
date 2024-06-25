package com.tech.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Write a Java program to find common elements between two integer arrays.

public class CommanElements {
	public static void main(String[] args) {
		int[] array1= {1,3,5,2,7,9,3};
		int[] array2= {3,2,9,3,4,8};
		
		Set<Integer> firstSet= new HashSet<Integer>();
		for(int element : array1) {
			firstSet.add(element);
		}
		Set<Integer> commonElementSet=new HashSet<Integer>();
		for(int element : array2) {
			if(firstSet.contains(element)) {
				commonElementSet.add(element);
			}
		}
		System.out.println(Arrays.toString(commonElementSet.toArray()));
	}
}
