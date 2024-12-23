package com.tech.nextwave;
import java.util.*;

public class KeywordBoldening {

	public static String boldKeywords(String[] keywords, String text) {
		boolean[] shouldBold = new boolean[text.length()];
		for (String keyword : keywords) {
			int index = text.indexOf(keyword);
			while (index != -1) {
				for (int i = index; i < index + keyword.length(); i++) {
					shouldBold[i] = true;
				}
				index = text.indexOf(keyword, index + 1);
			}
		}

		StringBuilder result = new StringBuilder();
		boolean inBold = false;
		for (int i = 0; i < text.length(); i++) {
			if (shouldBold[i]) {
				if (!inBold) {
					result.append("<b>");
					inBold = true;
				}
				result.append(text.charAt(i));
			} else {
				if (inBold) {
					result.append("</b>");
					inBold = false;
				}
				result.append(text.charAt(i));
			}
		}
		if (inBold) {
			result.append("</b>");
		}

		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numKeywords = scanner.nextInt();
		scanner.nextLine();

		String[] keywords = new String[numKeywords];
		for (int i = 0; i < numKeywords; i++) {
			System.out.print(i + 1);
			keywords[i] = scanner.nextLine();
		}
		String text = scanner.nextLine();

		String formattedText = boldKeywords(keywords, text);

		System.out.println(formattedText);

		scanner.close();
	}
}
