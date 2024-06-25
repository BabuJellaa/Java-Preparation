package com.tech.tuesday;

import java.util.Scanner;

/* Take values of length and breadth from User and check if it is square or rectangle.*/


public class ShapeOfObject {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter length :");
		int length=scanner.nextInt();
		System.out.println("Please enter breadth :");
		int breadth=scanner.nextInt();
		
		if(length==breadth) {
			System.out.println("It's a Square");
		}
		else {
			System.out.println("It's a Rectangle brow....");
		}
		
		scanner.close();

	}

}
