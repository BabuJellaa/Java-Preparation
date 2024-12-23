package com.tech.tricky;

import java.util.*;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
			if (!map.containsKey(sortedStr)) {
				map.put(sortedStr, new ArrayList<>());
			}
			map.get(sortedStr).add(s);
		}

		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		GroupAnagrams sol = new GroupAnagrams();
		System.out.println(sol.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
		// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
	}
}
