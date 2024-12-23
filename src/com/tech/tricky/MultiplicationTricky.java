package com.tech.tricky;

public class MultiplicationTricky {
	public static void main(String[] args) {

		int num1 = 4;
		int num2 = 5;
		int multiplicationResult = 0;

		for(int i=1; i<=num2; i++) {
			multiplicationResult+=num1;
		}

		System.out.println(multiplicationResult);


		int number = 1678;
		String numStr = Integer.toString(number);
		int sum = 0;

		for (int i = 0; i < numStr.length(); i++) {
			sum += Character.getNumericValue(numStr.charAt(i));
		}

		System.out.println(sum);
	}
}


// You can ask coding questions