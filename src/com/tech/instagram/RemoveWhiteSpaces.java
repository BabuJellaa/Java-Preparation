package com.tech.instagram;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String name= " Ba bu Jel lla ";
		StringBuilder updatedString = new StringBuilder();

		for(int number=0;number<name.length();number++) {
			char character = name.charAt(number);

			if(!Character.isWhitespace(character)) {
				updatedString.append(character);
			}
		}

		System.out.println(updatedString.toString());
	}
}
