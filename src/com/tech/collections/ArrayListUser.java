package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListUser {
	public static void main(String[] args) {
		
		List<String> userList=new ArrayList();
		
		// Add one element to list.
		userList.add("Jella");
		
		//Add multiple elements to list at a time.
		Collections.addAll(userList, "Babu","Venky","Ajay","Anji","Raju","Naveen");
		
		// Iterable interface to iterate the collection.
		Iterator<String> iterator=userList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
