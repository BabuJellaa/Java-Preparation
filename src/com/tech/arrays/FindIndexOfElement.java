package com.tech.arrays;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

/*Find the index of an array element*/

public class FindIndexOfElement {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,8,9};
		int numberToFind= 8;
		int index=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==numberToFind) {
				index=i;
			}
		}
		System.out.println("Index of the given number "+numberToFind+" is : "+index);
		
		
		// Using Streams
		
		OptionalInt indexNumber=IntStream.range(0, numbers.length).filter(number->numbers[number]==numberToFind).findFirst();
		
		if(indexNumber.isPresent()) {
			System.out.println("The index of the given number is : "+indexNumber.getAsInt());
		}
	}
}
