package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchingElement {
	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		Collections.addAll(names, "Babu","Paddu","Ramesh","Akhil");
		
		Collections.sort(names);
		
		System.out.println(Collections.binarySearch(names, "Paddu"));
		
		System.out.println(Collections.binarySearch(names, "Chotu"));
	}
}
