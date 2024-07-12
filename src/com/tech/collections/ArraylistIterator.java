package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*Write a Java program to iterate through all elements in an array list.*/

public class ArraylistIterator {
	public static void main(String[] args) {
List<String> names=new ArrayList<String>();
		
		Collections.addAll(names, "Babu","Venky","Raju","Naveen","Anji","Bhargav");
		
		// Using iterator and using one of its method called remove ()
		Iterator<String> iterator= names.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			if(name == "Bhargav") {
				iterator.remove();
			}
			System.out.println(name);
		}
		
		System.out.println();
		
		// Using iterable
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println();
	}
}
