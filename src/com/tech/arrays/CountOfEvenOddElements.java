package com.tech.arrays;

import java.util.Arrays;
import java.util.Iterator;

//Write a Java program to find the number of even and odd integers in a given array of integers

public class CountOfEvenOddElements {
	public static void main(String[] args) {
		int array[]=InputUtil.readArray();
		int evenCount=0;
		int oddCount=0;
		
		for(int number=0;number<array.length;number++) {
			if(number%2==0) {
				evenCount+=1;
			}
			else {
				oddCount+=1;
			}
		}
		System.out.println("From the Array:      "+Arrays.toString(array)+"     Count of the Even numbers is : "+evenCount+" and Count of the Odd numbers is : "+oddCount);
	}
}
