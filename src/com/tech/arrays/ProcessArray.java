package com.tech.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ProcessArray {

	public static void smallLargeSum(Integer[] array) {
		Vector<Integer> evenVector=new Vector<Integer>();
		Vector<Integer> oddVector= new Vector<Integer>();

		if(array.length<=3 || array.length==0) {
			System.out.println("0");
		}
		for(int number=0;number<array.length;number++) {
			if(number%2==0) {
				evenVector.add(array[number]);
			}
			else {
				oddVector.add(array[number]);
			}
		}
		Collections.sort(evenVector);
		Collections.sort(oddVector);
		System.out.println("From Array : "+Arrays.toString(array)+"\n"
				+ "Second largest number in even locations : "+((int) evenVector.toArray()[evenVector.toArray().length-2])+"\n "
				+ "Second largest number in odd locations is  :"+((int) oddVector.toArray()[oddVector.toArray().length-2])+"\n "
				+ "Total sum is : "+(((int) evenVector.toArray()[evenVector.toArray().length-2])+((int) oddVector.toArray()[oddVector.toArray().length-2])));

	}
	public static void main(String[] args) {
		Integer array[]= {3,2,1,7,5,4};
		smallLargeSum(array);
	}
}
