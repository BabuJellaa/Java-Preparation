package com.capgemini;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String word="abbc";

		// One way 
		Map< Character, Integer> freqOfCharacters = new HashMap<Character, Integer>();

		for (char character : word.toCharArray()) {
			freqOfCharacters.put(character, freqOfCharacters.getOrDefault(character, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : freqOfCharacters.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		//  Second way

		Map< Character, Integer> freqOfCharactersUsingForLoop = new HashMap<Character, Integer>();
		for(int i=0;i < word.length();i++) {
			int count=0;
			if (freqOfCharactersUsingForLoop.containsKey(word.charAt(i))) {
                continue;
            }
			for(int j=i;j<word.length();j++) {
				if(word.charAt(i)==word.charAt(j)) {
					count++;
				}
			}
			freqOfCharactersUsingForLoop.put(word.charAt(i), count);
		}
		for (Map.Entry<Character, Integer> entry : freqOfCharactersUsingForLoop.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
