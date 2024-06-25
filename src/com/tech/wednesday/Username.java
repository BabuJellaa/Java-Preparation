package com.tech.wednesday;

import java.util.Scanner;

/*  Write a java program print full name is jella Babu when criteria meets given name in java  */

public class Username {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name :");
		String name=scanner.next().toLowerCase();

		switch (name) {
		case "babu":
			System.out.println("Babu Jella");
			break;
		case "paddu":
			System.out.println("Padmarani Rondla");
			break;
		case "ramesh":
			System.out.println("Ramesh Gandyala");
			break;
		}
		scanner.close();
	}
}
