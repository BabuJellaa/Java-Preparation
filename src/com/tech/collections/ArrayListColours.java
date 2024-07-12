package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*Write a Java program to create an array list, add some colors (strings) and print out the collection*/

public class ArrayListColours {
	public static void main(String[] args) {
		List<String> colours=new ArrayList<String>();
		Collections.addAll(colours, "Red","White","Black","Yellow","Pink");
		
		System.out.println(colours);  // one way
		System.out.println();
		
		for(String colour : colours) {    // Second way using iterable
			System.out.println(colour);
		}
		
		System.out.println();
		
		Iterator<String>iterator=colours.iterator(); // Third way using Iterator
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
