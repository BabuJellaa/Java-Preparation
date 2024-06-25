package com.tech.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

//Write a Java program to find the sum of second smallest element and first largest element in an array. 

public class SumOfMinMaxElements {
	public static void main(String[] args) {
		int[] array = InputUtil.readArray();
		
		if(array.length<3) {
			throw new IllegalArgumentException("Array must contains at lease 3 elements to process the request..!!!");
		}
		else {
			Arrays.sort(array);
			System.out.println("Largest number from array is "+array[array.length-1]+" and Second smallest number is "+array[1]+" and their sum is : "+((array[array.length-1])+(array[1])));
		}
	}
}
