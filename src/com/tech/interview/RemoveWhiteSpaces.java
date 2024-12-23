package com.tech.interview;

/*How do you remove all white spaces from a string in Java?*/

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String name="B a b u J e l  l a";
		StringBuilder builder = new StringBuilder();
		for(char character : name.toCharArray()) {
			if(character != ' ') {
				builder.append(character);
			}
		}
		
		String modifiedName=builder.toString();
		
		System.out.println("Modified name : "+ modifiedName);
	}
}
