package com.tech.hackkerank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataStructureArrayList {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the number Of Arrays you want to add :");
		int numberOfArrays=scanner.nextInt();
		
		List<List<Integer>> mainList=new ArrayList<List<Integer>>();
		
		System.out.println("Add arrays :");
		for(int listNum=1;listNum<=numberOfArrays;listNum++) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			System.out.println("Enter the size of the :"+listNum+" array :");
			int numOfNum=scanner.nextInt();
			System.out.println("Please add elements :");
			for(int elements=1;elements<=numOfNum;elements++) {
				list.add(scanner.nextInt());
			}
			mainList.add(list);
		}
		
		System.out.println("Enter the size of the elements you want to add as pair :");
		int sizeOfPair=scanner.nextInt();
		for(int pairSize=1;pairSize<=sizeOfPair;pairSize++) {
			int a=scanner.nextInt();
			int b=scanner.nextInt();
			
			if(b> mainList.get(a-1).size()) {
				System.out.println("ERROR!");
			}
			else {
				System.out.println(mainList.get(a).get(b));
			}
		}
		scanner.close();
	}

}
