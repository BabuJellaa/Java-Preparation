package com.tech.instagram;

//2. How do you swap two numbers without using a third variable in Java?

public class SwapingNumbers {
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		
		 a= a+b;
		 b = a-b;
		 a = a-b;
		 
		 System.out.println("a : "+a+" b : "+b);
	}
}
