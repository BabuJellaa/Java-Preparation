package com.tech.tricky;

public class Subtraction {
	
	// Subtraction one way...
	public static int oneWay(int num1, int num2) { 
		return num1 + (~ num2 + 1);
	}
	
	//Second way..
	public static int secondWay(int num1, int num2) {
        if (num2 > num1) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        while (num2 != 0) {       
            num1--;
            num2--;
        } 
		return num1;
	}
	
	public static void main(String[] args) {
		
		int number1=30;
		int number2=14;
		
		/*
		 * System.out.println("One way of subtraction....."+oneWay(number1, number2));
		 * System.out.println("Second way of subtraction....."+secondWay(number1,
		 * number2));
		 */
		
		int num1 = 10;
        int num2 = 100;

        while (num2 > 0) {
            num1--;
            num2--;
        }

        System.out.println("Subtraction result: " + num1);
	}

}
