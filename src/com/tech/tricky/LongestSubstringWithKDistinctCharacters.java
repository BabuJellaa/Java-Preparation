package com.tech.tricky;

import java.util.HashMap;

public class LongestSubstringWithKDistinctCharacters {
	public int lengthOfLongestSubstringKDistinct(String s, int k) {
		if (s == null || s.length() == 0 || k == 0) return 0;

		HashMap<Character, Integer> map = new HashMap<>();
		int maxLen = 0, left = 0;

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			map.put(c, map.getOrDefault(c, 0) + 1);

			while (map.size() > k) {
				char leftChar = s.charAt(left);
				map.put(leftChar, map.get(leftChar) - 1);
				if (map.get(leftChar) == 0) map.remove(leftChar);
				left++;
			}

			maxLen = Math.max(maxLen, right - left + 1);
		}

		return maxLen;
	}

	public static void main(String[] args) {
		LongestSubstringWithKDistinctCharacters solution = new LongestSubstringWithKDistinctCharacters();
		String s = "eceba";
		int k = 2;
		System.out.println("Longest substring length: " + solution.lengthOfLongestSubstringKDistinct(s, k));
	}
}

