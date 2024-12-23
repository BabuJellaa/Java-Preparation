package com.tech.instagram;

//  Write a Java program to check if a vowel is present in a string.

public class StringContainsVowels {
	public static void main(String[] args) {
		
		String name = "Babu";
		
		System.out.println(name.toLowerCase().matches(".*[aeiou].*"));
	}
}
