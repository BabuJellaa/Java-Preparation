package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Write a Java program to retrieve an element (at a specified index) from a given array list.*/

public class RetrieveELementAtIndex {
	public static void main(String[] args) {
		List<String> colours=new ArrayList<String>();
		Collections.addAll(colours, "Red","White","Black","Yellow","Pink");
		
		System.out.println(colours.get(0));
	}
}
