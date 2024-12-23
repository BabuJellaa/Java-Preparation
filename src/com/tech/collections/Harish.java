package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Harish {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		
		names.add("Harish");
		
		Collections.addAll(names, "Ram","Ajay","Rakesh","Babu");
		
		System.out.println(names);
	}
}
