package com.tech.instagram;

//1. How do you reverse a string in Java?

public class ReverseString {
	public static void main(String[] args) {
		String name = "Babu";
		
		StringBuilder builder = new StringBuilder(name);
		StringBuilder reversName=builder.reverse();
		System.out.println(reversName.toString());
	}
}
