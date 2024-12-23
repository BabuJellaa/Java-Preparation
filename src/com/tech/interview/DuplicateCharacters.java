package com.tech.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*How to find duplicate characters in a string and its count in Java?*/

public class DuplicateCharacters {
	public static void main(String[] args) {
		String name = "Better Butter";

		Map<Character, Integer> charactersCount = new HashMap<Character, Integer>();
		for(int i=0;i<name.length();i++) {
			if(charactersCount.containsKey(name.charAt(i))) {
				continue;
			}
			int count=0;
			for(int j=i ; j<name.length();j++) {
				if(name.charAt(i) == name.charAt(j)) {
					count++;
				}
			}
			if(name.charAt(i) != ' ') {
				charactersCount.put(name.charAt(i), count);
			}
		}

		for(Entry<Character, Integer> character : charactersCount.entrySet()) {
			System.out.println("Character :   "+ character.getKey()+"  ..  Count is :   "+character.getValue());
		}
	}
}
