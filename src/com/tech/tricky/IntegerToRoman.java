package com.tech.tricky;

import java.util.Scanner;

public class IntegerToRoman {
	public static void main(String[] args) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter an Integer : ");
			String[] thousands = {"", "M", "MM", "MMM"};
			String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
			String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
			String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

			int number=scanner.nextInt();

			String romanValue="";

			romanValue+=thousands[number/1000];
			romanValue+=hundreds[(number%1000)/100];
			romanValue+=tens[(number%100)/10];
			romanValue+=ones[number%10];

			System.out.println(romanValue);
			System.out.println("Want to exit : press 1 ");
			int option=scanner.nextInt();
			if(option==1) {
				break;
			}
		}
	}
}
