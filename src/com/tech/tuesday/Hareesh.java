package com.tech.tuesday;

import java.util.Scanner;

public class Hareesh {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter your input..");
		String input=scanner.nextLine(); // Canada
		
		if(input=="USA") {
			
			System.out.println("It is USA....");
			
		}
		else if(input== "Canada"){
			
			System.out.println("It is Canada...");
			
		}
		
		else if(input=="Babu") {
			
			System.out.println("My name is Babu...");
		}
		scanner.close();
	}
}
