package com.tech.arrays;

public class VowelsCount {
	public static void main(String[] args) {
		String str = "Babuuiuu";
		
		char[] charArray=str.toLowerCase().toCharArray();
		
		int count=0;
		for(char c : charArray) {
			if(c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u') {
				count++;
			}
		}
		
		System.out.println("Count..."+count);
	}
}
