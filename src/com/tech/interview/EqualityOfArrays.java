package com.tech.interview;

import java.util.Arrays;

/*How do you check the equality of two arrays in Java?*/	

public class EqualityOfArrays {
	public static void main(String[] args) {
		
		String[] flowersSet1 = {"Rose","Jasmine","Lily","Tulip","Magnolia"};
		
		String[] flowersSet2 = {"Lily","Jasmine","Magnolia","Tulip","Rose"};
		
		System.out.println(Arrays.equals(flowersSet1, flowersSet2));
		
		Arrays.sort(flowersSet1);
		Arrays.sort(flowersSet2);
		
		System.out.println(Arrays.equals(flowersSet1, flowersSet2));
	}
}
