package com.tech.tricky;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JumpGame {
	public static void main(String[] args) {
		Map<Character, Integer> countOfCharacters= new HashMap<Character, Integer>();
		String name="Babu".toLowerCase();

		for(int character=0;character<name.length();character++) {
			char letter = name.charAt(character);
			countOfCharacters.put(letter, countOfCharacters.getOrDefault(letter, 0)+1);
		}

		for(Entry<Character, Integer> countMap : countOfCharacters.entrySet()) {
			System.out.println(countMap.getKey() + " : "+ countMap.getValue());
		}
	}
}
