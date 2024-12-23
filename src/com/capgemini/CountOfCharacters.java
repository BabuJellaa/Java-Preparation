package com.capgemini;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOfCharacters {
	public static void main(String[] args) {
		String name="BabuJella".toLowerCase();
		
		Map<Character, Integer> characterCountList = new HashMap<Character, Integer>();
		for(int i=0;i<name.length();i++) {
			if(characterCountList.containsKey(name.charAt(i))) {
				continue;
			}
			int count=0;
			for(int j=i;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					count++;
				}
			}
			characterCountList.put(name.charAt(i), count);
		}
		
		for(Entry<Character, Integer> iterator : characterCountList.entrySet()) {
			System.out.println(iterator.getKey() + " : "+iterator.getValue());
		}
	}
}
