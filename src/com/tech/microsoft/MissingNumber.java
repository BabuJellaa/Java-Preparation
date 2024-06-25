package com.tech.microsoft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MissingNumber {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		try {
            BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.valueOf(inputReader.readLine());
            for (int num = 1; num <= number; num++) {
                if (num%3 == 0 && num%5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (num%3!= 0 && num%5!= 0) {
                    System.out.println(num);
                } else {
                    if (num%3 == 0) {
                        System.out.println("Fizz");
                    }
                    if (num%5 == 0) {
                        System.out.println("Buzz");
                    }
                }
            }
		}
		finally {
			System.out.println("Executed brow");
		}
	}
}
