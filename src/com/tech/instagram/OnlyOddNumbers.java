package com.tech.instagram;

import java.util.ArrayList;
import java.util.Arrays;

public class OnlyOddNumbers {

	public static boolean onlyOddNumbers(ArrayList<Integer> listOfIntegers) {
		for(int i  : listOfIntegers) {
			if(i%2==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(1);
		listOfIntegers.add(3);
		listOfIntegers.add(3);
		listOfIntegers.add(5);
		listOfIntegers.add(5);
		listOfIntegers.add(9);

		System.out.println(onlyOddNumbers(listOfIntegers));

	}
}
