package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyingListfromOther {
	public static void main(String[] args) {
		List<String> list1= new ArrayList<String>();
		Collections.addAll(list1, "Babu","Paddu","Ramesh","Akhil");
		
		List<String> list2= new ArrayList<String>(list1.size());
		for(int i=0;i<list1.size();i++) {
			list2.add(null);
		}
		Collections.copy(list2,list1);
		
		for(String name:list2) {
			System.out.println(name);
		}
	}
}
