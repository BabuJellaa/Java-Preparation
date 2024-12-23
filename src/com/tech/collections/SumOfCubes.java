package com.tech.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfCubes {
	public static void main(String[] args) {
		List<Integer> elements= Arrays.asList(1,2,3,4,5);
		
		// using streams
		int sumOftheElements=elements.stream().mapToInt(number -> number*number*number).sum();
		
		System.out.println("Total sum using streams : "+ sumOftheElements);
		
		// Using for each loop
		ArrayList< Integer> cubesList= new ArrayList<Integer>();
		int count=0;
		for(Integer element : elements) {
			int cubes=element*element*element;   // Logic for cubes ( n*n*n)
			cubesList.add(cubes);     // Adding cube of elements to list 
			count+=cubes;     // Adding it to count variable.
		}
		System.out.println("Total sum using for each loop : "+ count);
		System.out.println("List of cubic elements : "+cubesList);
	}
	
}
