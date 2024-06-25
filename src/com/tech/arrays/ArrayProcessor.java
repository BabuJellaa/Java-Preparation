package com.tech.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Vector;

/*  Write a function SmallLargeSum(array) which accepts the array as an argument or parameter, 
   that performs the addition of the second largest element from the even location with the second largest element from an odd location?

Rules:
a. All the array elements are unique.
b. If the length of the array is 3 or less than 3, then return 0.
c. If Array is empty then return zero.

Sample Test Case 1:
Input:
6
3 2 1 7 5 4
Output:
7

Explanation: The second largest element in the even locations (3, 1, 5) is 3. The second largest element in the odd locations (2, 7, 4) is 4. So the addition of 3 and 4 is 7. So the answer is 7.*/

public class ArrayProcessor {
	public static void smallLargeSum(Integer[] array) {
		if(array.length<=3 || array.length==0) {
			System.out.println("0");
		}
		int count=0;

		for(int element=0;element<array.length;element++) { for(int
				secondElement=element+1;secondElement<array.length-1;secondElement++) {
			if(array[element]==array[secondElement]) { count=1; } } }

		Vector<Integer> evenVector=new Vector<Integer>();
		Vector<Integer> oddVector= new Vector<Integer>();
		if(count>0) {
			System.out.println("'Are Madarchod lowde duplicate number kyun daala... maine pahele bataayaa???' 😀"); 
		}
		System.out.println();
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
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter size : ");
		int size=scanner.nextInt();
		System.out.println("Provide elements to array... Kindly don't enter duplicate numbers.....!!!");
		Integer[] array=new Integer[size];
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		smallLargeSum(array);
		scanner.close();
	}
	
	
}
