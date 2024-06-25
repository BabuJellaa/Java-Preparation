package com.tech.arrays;

import java.util.Scanner;

public class InputUtil {
	private static final Scanner scanner=new Scanner(System.in);
	
	public static int[] readArray() {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
