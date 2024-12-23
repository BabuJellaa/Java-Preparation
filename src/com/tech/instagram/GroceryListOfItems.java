package com.tech.instagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroceryListOfItems {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many grocery items you want to check : ");
		int groceryItemCount= scanner.nextInt();
		
		Map< String, Double> groceryList = new HashMap<String, Double>();
		
		double avarageSellingPrice=0.0;
		double highestSellingPrice=0.0;
		String groceryItem="";
		
		for(int item=0;item<groceryItemCount;item++) {
			System.out.println("Enter grocery item name : ");
			String groceryName=scanner.next();
			System.out.println("Enter grocery price : ");
			double groceryPrice=scanner.nextDouble();
			System.out.println("Enter grocery quantity sold : ");
			int groceryQuantitySold=scanner.nextInt();
			
			groceryList.put(groceryName, groceryPrice*groceryQuantitySold);
			
			if(groceryList.get(groceryName)>highestSellingPrice) {
				highestSellingPrice = groceryList.get(groceryName);
				groceryItem = groceryName;
			}
			avarageSellingPrice+=groceryPrice*groceryQuantitySold;
		}
		
		double avarageSelling=avarageSellingPrice/groceryItemCount;
		
		System.out.println("Item with highest total selling price is :    "+groceryItem+ "   and \n  Total selling price of all grocery items is :   "+avarageSellingPrice+"  and \n  Avarage selling price as per grocery item is :  "+avarageSelling);
		scanner.close();
	}
}
