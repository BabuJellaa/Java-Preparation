package com.tech.tricky;

import java.util.ArrayList;
import java.util.List;

public class SumOftheMultiplications {
	public static void main(String[] args) {
		int targetNumber = 10;

		int sumOfTheOddResult=0;
		int sumOfTheEvenResult=0;
		int totalSum=0;

		for(int number=0;number<=targetNumber;number++) {
			
			if(number%2!=0) {
				int multiplicationResult=number*targetNumber;
				sumOfTheOddResult+=multiplicationResult;
			}
			else {
				int multiplicationResult=number*targetNumber;
				sumOfTheEvenResult+=multiplicationResult;
			}
		}
		totalSum=sumOfTheEvenResult+sumOfTheOddResult;
		System.out.println("Odd sum : "+sumOfTheOddResult +" and Even sum : "+sumOfTheEvenResult + " and Total sum is : "+totalSum);
		System.out.println();
		
		List<Integer> primeNumbers = new ArrayList<Integer>();
		int sumOfPrimeNumbers=0;
		for (int number=2;number<=targetNumber;number++) {
			boolean isnumberPrime=true;
			for(int number2=2;number2<=number/2;number2++) {
				if(number%number2 ==0) {
					isnumberPrime=false;
					break;
				}
			}
			if(isnumberPrime) {
				primeNumbers.add(number);
				sumOfPrimeNumbers+=number*targetNumber;
			}
		}
		
		System.out.println("Prime number in range of "+targetNumber + " are "+primeNumbers+" and the sum is : "+sumOfPrimeNumbers);
	}
}
