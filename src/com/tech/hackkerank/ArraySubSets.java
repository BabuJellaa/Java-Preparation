package com.tech.hackkerank;

import java.util.Scanner;

public class ArraySubSets {
	
    public static void main(String[] args) {
    	int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of the Array :");
        int size = scanner.nextInt();
        int[] babuArray = new int[size];  
        System.out.println("Enter elements to Array :");
        for (int i = 0; i < size; i++) {
            babuArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < babuArray.length; i++) {
            int sum = 0;
            for (int j = i; j < babuArray.length; j++) {
                sum += babuArray[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scanner.close();
    }
}