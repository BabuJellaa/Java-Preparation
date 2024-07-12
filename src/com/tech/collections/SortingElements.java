package com.tech.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingElements {
	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		Collections.addAll(names, "Babu","Paddu","Ramesh","Akhil");
		
		// Collection sorting.
		
		Collections.sort(names);
		
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println();
		
		//Collection in reverse order.
		
		Collections.sort(names, Collections.reverseOrder());
		
		for(String name: names) {
			System.out.println(name);
		}
	}
}
