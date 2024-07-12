package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AddingElementToTheList {
	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		Collections.addAll(names, "Babu","Paddu","Ramesh","Akhil");
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println();
		
		Iterator<String> name=names.iterator();
		while(name.hasNext()) {
			System.out.println(name.next());
		}
	}
}
