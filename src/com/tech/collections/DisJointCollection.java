package com.tech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DisJointCollection {
	public static void main(String[] args) {
		List<String> list1= new ArrayList<String>();
		Collections.addAll(list1, "Babu","Paddu","Ramesh","Akhil");
		
		List<String> names=new ArrayList<String>();
		Collections.addAll(names, "Venky","Raju","Naveen","Anji","Bhargav");
		
		System.out.println(Collections.disjoint(list1, names));
	}
}
